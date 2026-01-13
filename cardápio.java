package servico;

import modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cardapio{

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarDisponiveis() {
        return produtos.stream()
                .filter(Produto::isDisponivel)
                .collect(Collectors.toList());
    }

    public List<Produto> filtrarPorRestricao(String restricao) {
        return produtos.stream()
                .filter(p -> p.getRestricoes().contains(restricao))
                .collect(Collectors.toList());
    }

    public List<Produto> getTodos() {
        return produtos;
    }
}
