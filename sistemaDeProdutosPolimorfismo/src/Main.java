import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProduct = sc.nextInt();

        sc.nextLine();

        for(int i = 1; i <= numberOfProduct; i++) {
            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProduct = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(typeProduct == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                productList.add(new ImportedProduct(name, price, customsFee));
            }
            else if(typeProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                String manufactureDate = sc.nextLine();

                productList.add(new UsedProduct(name, price, LocalDate.parse(manufactureDate, fmt1)));
            }
            else {
                productList.add(new Product(name, price));
            }
        }

        System.out.println();

        System.out.println("Price Tags:");

        for(Product product : productList) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}