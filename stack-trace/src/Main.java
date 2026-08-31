import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method1();
        System.out.println("End Of Program");
    }

    public static void method1() {
        System.out.println("**** METHOD1 START ****");
        method2();
        System.out.println("**** METHOD1 END ****");
    }

    public static void method2() {
        System.out.println("**** METHOD2 START ****");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid position!");
            exception.printStackTrace();
            sc.nextLine();
        }
        catch (InputMismatchException exception) {
            System.out.println("Input error");
        }
        sc.close();
        System.out.println("**** METHOD2 END ****");
    }
}