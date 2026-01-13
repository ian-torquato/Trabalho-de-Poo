package modelo;

import java.util.List;

public class Pratos extends Produto {

    public Pratos(String nome, double preco, int tempoPreparo, List<String> restricoes) {
        super(nome, preco, tempoPreparo, restricoes);
    }

    @Override
    public String getCategoria() {
        return "Prato";
    }
}
