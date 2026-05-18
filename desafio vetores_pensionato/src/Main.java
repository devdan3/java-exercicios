import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        String[] name = new String[10];
        String[] email = new String[10];
        int roomNumber;
        String nametemp, emailtemp;

        for(int i = 0; i < n; i++){
            System.out.println("Rent #" + (i + 1));
            sc.nextLine();
            System.out.print("Name: ");
            nametemp = sc.nextLine();
            System.out.print("Email: ");
            emailtemp = sc.nextLine();
            System.out.print("Room: ");
            roomNumber = sc.nextInt();
            name[roomNumber] = nametemp;
            email[roomNumber] = emailtemp;
        }
        System.out.println("Busy rooms");
        for(int i = 0; i < name.length; i++){
            if(name[i] != null){
                System.out.println(i + ": " + name[i] + ", " + email[i]);

            }
        }
    }
}