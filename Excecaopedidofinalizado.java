package excecao;

public class PedidoFinalizadoException extends RuntimeException {
    public PedidoFinalizadoException() {
        super("Pedido já finalizado.");
    }
}
