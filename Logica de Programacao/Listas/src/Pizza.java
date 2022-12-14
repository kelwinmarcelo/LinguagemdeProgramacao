import java.util.ArrayList;

public class Pizza {
    private String nome;
    private String tamanho;
    private boolean possuiBordaRecheada;
    private Double valor;
    private ArrayList<Ingredientes> listaIngredientes = new ArrayList<Ingredientes>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isPossuiBordaRecheada() {
        return possuiBordaRecheada;
    }

    public void setPossuiBordaRecheada(boolean possuiBordaRecheada) {
        this.possuiBordaRecheada = possuiBordaRecheada;
    }

    public int getQuantidadeIngredientes() {
        return listaIngredientes.size();
    }

    public void adicionarIngredientesPizza(String ingrediente) {
        listaIngredientes.add(new Ingredientes(ingrediente));
    }

    public Double calcularPrecoPizza() {

        Double valorPizza = 0.;

        if (getTamanho().equals("G")) {
            valorPizza += 45;
        }
        if (getTamanho().equals("M")) {
            valorPizza += 30;
        } else if (getTamanho().equals("P")) {
            valorPizza += 20;
        }

        if (listaIngredientes.size() > 5) {
            valorPizza += 5;
        }

        if (isPossuiBordaRecheada()) {
            valorPizza += 8;
        }

        setValor(valorPizza);

        return getValor();
    }

    public ArrayList<Ingredientes> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingredientes> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

}