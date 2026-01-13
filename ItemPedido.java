package modelo;

public class ItemPedido {

    private Produto produto;
    private String comentario;

    public ItemPedido(Produto produto, String comentario) {
        this.produto = produto;
        this.comentario = comentario;
    }

    public Produto getProduto() {
        return produto;
    }

    public String getComentario() {
        return comentario;
    }
}
