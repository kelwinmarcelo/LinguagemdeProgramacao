import java.util.*;

public class ContarVogal {
    public static void main(String[] args) {
        String frase;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite uma frase");
        frase = leitura.nextLine();

        calculaVogais(frase);

        leitura.close();
    }

    public static void calculaVogais(String frase) {
        int contarVogal = 0;
        final String VOGAIS = "AEIOU";
        String vogalReferencia = "";

        for (int i = 0; i < VOGAIS.length(); i++) {
            vogalReferencia = VOGAIS.substring(i, i + 1);

            if (frase.contains(vogalReferencia) || frase.contains(vogalReferencia.toLowerCase())) {
                contarVogal++;
            }
        }
        System.out.println("A frase tem " + contarVogal + " vogais ");
    }
}
