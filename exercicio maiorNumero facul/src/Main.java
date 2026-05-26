import util.MathUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int number1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int number2 = sc.nextInt();

        int result = MathUtils.max(number1, number2);

        System.out.println("O maior número é: " + result);

        sc.close();
    }
}