package Class;

public class Prato {

    String nome;

    public String getNome() {
        return nome;
    }

    Double valor;

    public Double getValor() {
        return valor;
    }

    public Prato(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

}