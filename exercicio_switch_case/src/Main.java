import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String dia;
        System.out.print("Escolha um número de 1 a 7 e veja o dia da semana correspondente: ");
        x = sc.nextInt();
        dia = switch (x) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Valor invalido";
        };
        System.out.println("Dia da semana: " + dia);
    }
}