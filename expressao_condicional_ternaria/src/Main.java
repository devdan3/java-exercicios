import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double preco;
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o preço do seu produto? ");
        preco = sc.nextDouble();
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05 ;
        System.out.printf("Seu desconto é: %.2f%n", desconto);
    }
}