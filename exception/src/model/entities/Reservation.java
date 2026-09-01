package model.entities;

import model.exceptions.DomainExceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

    public static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private int roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation() {

    }

    public Reservation(int roomNumber, LocalDate checkin, LocalDate checkout) {
        if(checkout.isAfter(checkin)) {
            throw new DomainExceptions("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public long duration(){
        return ChronoUnit.DAYS.between(checkin, checkout);
    }

    public void updateDates(LocalDate checkin, LocalDate checkout) {
        LocalDate now = LocalDate.now();
        if(checkin.isBefore(now) || checkout.isBefore(now)) {
            throw new DomainExceptions("Reservation dates for update must be future dates");
        }
        if(checkout.isAfter(checkin)) {
            throw new DomainExceptions("Check-out date must be after check-in date");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + fmt1.format(checkin)
                + ", check-out: "
                + fmt1.format(checkin)
                + ", "
                + duration()
                + " nights";
    }
}