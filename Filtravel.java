package servico;

import modelo.Produto;
import java.util.List;

public interface Filtravel {

    List<Produto> filtrarPorRestricao(String restricao);

}
