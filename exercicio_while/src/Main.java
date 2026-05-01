import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDigitado, somaDosNumeros = 0, quantidadeDeNumeros = 0;
        System.out.println("Digite qualquer número, caso queira parar, digite: 0");
        numeroDigitado = sc.nextInt();
        while (numeroDigitado != 0) {
            quantidadeDeNumeros += 1;
            somaDosNumeros += numeroDigitado;
            numeroDigitado = sc.nextInt();
        }
        System.out.println("A soma dos números digitados é: " + somaDosNumeros + " números");
        System.out.println("Você digitou: " + quantidadeDeNumeros + " números");
    }
}