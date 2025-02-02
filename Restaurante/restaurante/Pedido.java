package restaurante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String nomeCliente;
    private List<String> pratos;

    public Pedido() {
        this.numeroPedido = 0;
        this.nomeCliente = "";
        this.pratos = new ArrayList<String>();
    }

    public Pedido(int numeroPedido, String nomeCliente, List<String> pratos) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.pratos = pratos;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<String> getPratos() {
        return pratos;
    }

    public void setPratos(List<String> pratos) {
        this.pratos = pratos;
    }

    //Metódo Para Validar se o Nome é vazio
    public String validaNome(String nome) {
        if(nome.length() == 0) {
            System.out.println("Nome não informado!");
            return "";
        } else {
            return nome;
        }
    }

    
}