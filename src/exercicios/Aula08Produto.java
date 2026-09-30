public class Aula08Produto {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 4.50, 5);
        Produto feijao = new Produto("Feijao", 8.70, 3);
        Produto cafe = new Produto("Café", 15.50, 8);

        System.out.println(arroz.nome + ": R$ " + arroz.preco + " (" + arroz.quantidadeEstoque + " em estoque)");
        System.out.println(feijao.nome + ": R$ " + feijao.preco + " (" + feijao.quantidadeEstoque + " em estoque)");
        System.out.println(cafe.nome + ": R$ " + cafe.preco + " (" + cafe.quantidadeEstoque + " em estoque)");
    }
}