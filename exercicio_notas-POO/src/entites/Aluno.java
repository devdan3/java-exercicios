package entites;

public class Aluno {
    public String nome;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;

    public double notaFinal(){
        return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
    }

    public String situacaoDoAluno(){
        if(notaFinal() > 60){
            return "Aprovado";
        }
        else {
            return "Reprovado, Falta " + (60 - notaFinal()) + " pontos.";
        }
    }
}
