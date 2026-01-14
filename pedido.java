package excecao;

public class PedidoVazioException extends RuntimeException {

    public PedidoVazioException() {

        super("Não é possível finalizar o pedido");
    }
}
