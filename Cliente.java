package modelo;

public class Cliente extends Usuario {

    public Cliente(String nome) {
        super(nome);
    }

    @Override
    public String getTipo() {
        return "Cliente";
    }
}
