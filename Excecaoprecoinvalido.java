package excecao;

public class PrecoInvalidoException extends RuntimeException {
    public PrecoInvalidoException() {
        super("O preço deve ser maior que R$ 0,00.");
    }
}
