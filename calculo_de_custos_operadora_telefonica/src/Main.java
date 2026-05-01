import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorTotal, minutosUsados;
        System.out.print("Quantos minutos você consumiu em ligações? ");
        minutosUsados = sc.nextInt();
        valorTotal = 50;
        if (minutosUsados > 100){
            valorTotal += (minutosUsados - 100) * 2;
        }
        System.out.printf("Valor Total: R$%d%n", valorTotal);
    }
}