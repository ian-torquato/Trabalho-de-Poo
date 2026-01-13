package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static int contador = 1;

    private int numero;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private boolean finalizado;

    public Pedido(Cliente cliente) {
        this.numero = contador++;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.finalizado = false;
    }

    public void adicionarItem(Produto produto, String comentario) {
        itens.add(new ItemPedido(produto, comentario));
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        return itens.stream()
                .mapToDouble(i -> i.getProduto().getPreco())
                .sum();
    }

    public int calcularTempoTotal() {
        return itens.stream()
                .mapToInt(i -> i.getProduto().getTempoPreparo())
                .sum();
    }

    public void finalizar() {
        if (itens.isEmpty()) {
            throw new IllegalStateException("Pedido não pode ser finalizado vazio");
        }
        finalizado = true;
    }

    public int getNumero() {
        return numero;
    }
}
