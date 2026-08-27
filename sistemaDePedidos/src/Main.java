import entites.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter birthDayfmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm/ss");

        System.out.println("Enter Client Data");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();

        sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        Client client = new Client(name, email, LocalDate.parse(birthDate, birthDayfmt));

        System.out.println("Enter Order Data");

        System.out.print("Status: ");
        String status = sc.next();

        LocalDateTime moment = LocalDateTime.now();

        OrderStatus orderStatus = OrderStatus.valueOf(status);

        Order order = new Order(moment, orderStatus, client);

        System.out.print("How many items to this order? ");
        int itemsQuantity = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i < itemsQuantity; i++){
            System.out.println("Enter #" + (i + 1) + " item data:");

            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }
        System.out.println();

        System.out.println("ORDER SUMMARY:");

        System.out.println("Order moment: " + order.getMoment().format(fmt1));

        System.out.println("Order status: " +  order.getStatus());

        System.out.println("Client: " + order.getClient());

        System.out.println("Order items:");

        for (OrderItem item : order.getItems()){
            System.out.println(item);
        }

        System.out.println("Total price: $" + String.format("%.2f", order.total()));

        sc.close();
    }
}