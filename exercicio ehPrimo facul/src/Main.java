import util.MathUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = sc.nextInt();

        boolean result = MathUtil.ehPrimo(number);

        if(result == true) {
            System.out.println("O número " + number + " é primo!");
        }
        else {
            System.out.println("O número " + number + " não é primo!");
        }
    }
}