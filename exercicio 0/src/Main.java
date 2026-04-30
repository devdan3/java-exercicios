import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale localizacao = Locale.getDefault();
        String idiomaDoSistema = localizacao.getDisplayLanguage();
        String paisDoSistema = localizacao.getDisplayCountry();
        System.out.println("O seu sistema está em " + idiomaDoSistema + " e o pais do seu sistema é " + paisDoSistema);
    }
}