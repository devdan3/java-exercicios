import entites.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();

        System.out.print("Nota do Primeiro Trimestre (0 até 30): ");
        aluno.notaPrimeiroTrimestre = sc.nextDouble();
        System.out.print("Nota do Segundo Trimestre (0 até 35): ");
        aluno.notaSegundoTrimestre = sc.nextDouble();
        System.out.print("Nota do Terceiro Trimestre (0 até 35): ");
        aluno.notaTerceiroTrimestre = sc.nextDouble();

        System.out.println("Nota final: " + aluno.notaFinal());
        System.out.println(aluno.situacaoDoAluno());
    }
}