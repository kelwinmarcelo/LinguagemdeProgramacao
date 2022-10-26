import java.util.ArrayList;
import java.util.Date;

public class Pedidos {

    private String numeroPedido;
    private Date data;
    private Clientes cliente = new Clientes();
    private ArrayList<Pizza> listaPizza = new ArrayList<Pizza>();

    public double calcularValorPedido() {

        double valorTotalPedido = 0;

        for (Pizza pizza : getListaPizza()) {
            valorTotalPedido += pizza.calcularPrecoPizza();
        }

        return valorTotalPedido;
    }

    public String imprimePedido() {
        return ("Pedido: " + getNumeroPedido() + "\nCliente: " + getCliente().getNomes() + "\nQuantidade de Pizzas: "
                + getListaPizza().size() + "\nValor Total do Pedido:" + calcularValorPedido());
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Pizza> getListaPizza() {
        return listaPizza;
    }

    public void setListaPizza(ArrayList<Pizza> listaPizza) {
        this.listaPizza = listaPizza;
    }
}