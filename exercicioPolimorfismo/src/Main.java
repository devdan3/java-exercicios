import entities.Employee;
import entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();

        sc.nextLine();
        for(int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hours: ");
            double valuePerHours = sc.nextDouble();

            if(outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                employeeList.add(new OutsorcedEmployee(name, hours, valuePerHours, additionalCharge));
            }
            else {
                employeeList.add(new Employee(name, hours, valuePerHours));
            }
        }

        System.out.println();

        System.out.println("Payments:");

        for(Employee emp : employeeList) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}