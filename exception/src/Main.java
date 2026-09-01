import model.entities.Reservation;
import model.exceptions.DomainExceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room Number: ");
            int roomNumber = sc.nextInt();

            System.out.print("Check-in date: ");
            LocalDate checkin = LocalDate.parse(sc.nextLine(),fmt1);

            System.out.print("Check-out date: ");
            LocalDate checkout = LocalDate.parse(sc.nextLine(),fmt1);

            Reservation reservation = new Reservation(roomNumber, checkin, checkout);

            System.out.println("Reservation: " + reservation);

            System.out.print("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = LocalDate.parse(sc.nextLine(), fmt1);

            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkout = LocalDate.parse(sc.nextLine(), fmt1);

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reservation);

        }
        catch (DomainExceptions e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected Error");
        }

        sc.close();
    }
}