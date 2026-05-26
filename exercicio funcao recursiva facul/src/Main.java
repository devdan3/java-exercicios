import utils.RecursionUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = sc.nextInt();

        int result = RecursionUtils.somatorio(number);

        System.out.println("O somatorio do número " + number + " é " + result);
    }
}