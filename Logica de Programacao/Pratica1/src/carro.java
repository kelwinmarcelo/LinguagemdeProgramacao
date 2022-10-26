
public class carro {
    private String cor;
    private String nome;

    public carro(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public void andar(float velocidade) {
        System.out.println("O carro está andando a " + velocidade + "Por hora");
    }
}
