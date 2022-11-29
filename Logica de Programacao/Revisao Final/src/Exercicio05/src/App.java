import java.util.ArrayList;

import javax.swing.JOptionPane;

import Class.Cozinha;
import Class.Pedido;
import Class.Prato;
import DataB.dbPratos;
import DataB.dbCozinhas;

public class App {
    public static void main(String[] args) throws Exception {
        Pedido meuPedido;

        ArrayList<Cozinha> cozinhas = new ArrayList<Cozinha>();

        cozinhas.add(new Cozinha("Árabe", dbPratos.gePratos()));
        cozinhas.add(new Cozinha("Italiana", dbPratos.gePratos()));
        cozinhas.add(new Cozinha("Mineira", dbPratos.gePratos()));

        String opcao = "";
        do {

            opcao = JOptionPane.showInputDialog(textoMenuInicial(cozinhas));

            if (Integer.parseInt(opcao) <= cozinhas.size()) {
                meuPedido = new Pedido(cozinhas.get(Integer.parseInt(opcao)));

                do {
                    opcao = JOptionPane.showInputDialog(textoMenuEscolherPratos(meuPedido.getPratos()));
                } while (!opcao.equalsIgnoreCase("N"));
            }

        } while (!opcao.equalsIgnoreCase("N"));

    }

    private static String textoMenuEscolherPratos(ArrayList<Prato> pratos) {

        String texto = "Selecione os pratos desejados \n";
        for (int i = 0; i < pratos.size(); i++) {
            texto += "\t " + i + " - " + pratos.get(i).getNome() + " \t R$ " + pratos.get(i).getValor();

        }
        texto += "\t N - Sair";
        return texto;
    }

    private static Object textoMenuInicial(ArrayList<Cozinha> cozinhas) {
        String texto = "Escolha um restaurante\n";
        for (int i = 0; i < cozinhas.size(); i++) {
            texto += "\t" + i + " - " + cozinhas.get(i).getTipo() + "\n";
        }
        texto += "\t N - Sair";

        return texto;
    }
}