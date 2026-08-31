import entities.Company;
import entities.Individual;
import entities.Taxpayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Taxpayers> taxpayersList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxPayers = sc.nextInt();

        for(int i = 1; i <= numberOfTaxPayers; i++) {
            System.out.println("Taxpayer #" + i + " data:");

            System.out.print("Individual or Company (i/c): ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();

            if(ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                taxpayersList.add(new Individual(name, annualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                taxpayersList.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }
        System.out.println();

        System.out.println("TAXES PAID:");

        double sum = 0.0;
        for(Taxpayers taxpayers : taxpayersList) {
            System.out.println(taxpayers.getName() + ": $" + String.format("%.2f", taxpayers.taxPaid()));
            sum += taxpayers.taxPaid();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

        sc.close();
    }
}