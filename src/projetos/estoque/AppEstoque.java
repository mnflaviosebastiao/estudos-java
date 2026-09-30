
import java.util.HashMap;
import java.util.Map;

public class AppEstoque {

    public static void main(String[] args) {
        HashMap<String, Produto> estoque = new HashMap<>();

        Produto feijao = new Produto("Feijão", 4.40, 23);
        Produto arroz = new Produto("Arroz", 5.30, 13);
        Produto acucar = new Produto("Açucar", 8.98, 9);
        Produto cafe = new Produto("Café", 16.10, 5);

        estoque.put("6a6e", cafe);
        estoque.put("a58r", acucar);
        estoque.put("wt14", arroz);
        estoque.put("6e4e", feijao);

        listarEstoque(estoque);

        mostrarProduto(estoque, "6a6e");
        mostrarProduto(estoque, "gke43");

        darEntrada(estoque, "6a6e", 5);
        mostrarProduto(estoque, "6a6e");
        darSaida(estoque, "6a6e", 3);
        mostrarProduto(estoque, "6a6e");
        darSaida(estoque, "6a6e", 33);
        mostrarProduto(estoque, "6a6e");

    }

    public static Produto buscaProduto(HashMap<String, Produto> estoque, String codigo) {
        if (estoque.containsKey(codigo)) {
            return estoque.get(codigo);
        }
        return null;
    }

    public static void mostrarProduto(HashMap<String, Produto> estoque, String codigo) {
        Produto p = buscaProduto(estoque, codigo);
        if (p != null) {
            p.apresentar();
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void listarEstoque(HashMap<String, Produto> estoque) {
        for (Map.Entry<String, Produto> entry : estoque.entrySet()) {
            String k = entry.getKey();
            Produto p = entry.getValue();
            System.out.print(k + " → ");
            p.apresentar();
        }
    }

    public static void darEntrada(HashMap<String, Produto> estoque, String codigo, int quantidade) {
        Produto p = buscaProduto(estoque, codigo);
        int quantidadeAdicionada = quantidade;
        if (p != null) {
            int novo = p.getQuantidadeEstoque() + quantidadeAdicionada;
            p.setQuantidadeEstoque(novo);
        }
    }

    public static void darSaida(HashMap<String, Produto> estoque, String codigo, int quantidade) {
        Produto p = buscaProduto(estoque, codigo);
        int estoqueAtual = p.getQuantidadeEstoque() - quantidade;
        if (p != null) {
            if (quantidade <= p.getQuantidadeEstoque()) {
                p.setQuantidadeEstoque(estoqueAtual);
            } else {
                System.out.println("Estoque insuficiente , seu estoque atual é: " + p.getQuantidadeEstoque());
            }
        }
    }
}
