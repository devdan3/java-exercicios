import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.print("Digite um valor de 0 a 100: ");
        valor = sc.nextDouble();
        if (valor < 0){
            System.out.println("Fora de intervalo");
        }
        else if (valor <= 25){
            System.out.println("Seu numero está no intervalo [0,25]");
        }
        else if (valor <= 50){
            System.out.println("Seu numero está no intervalo [25,50]");
        }
        else if (valor <= 75){
            System.out.println("Seu numero está no intervalo [50,75]");
        }
        else if (valor <= 100){
            System.out.println("Seu numero está no intervalo [75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }
        sc.close();
    }
}