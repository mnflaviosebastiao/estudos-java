
import java.util.ArrayList;

public class Aula10ArrayList {

    public static void main(String[] args) {
        ArrayList<String> compras = new ArrayList<>();
        compras.add("Batata");
        compras.add("Cuscuz");
        compras.add("Pão");
        compras.add("Macarrão");
        compras.add("Sabao");
        compras.add("Carne");
        System.out.println("Você tem " + compras.size() + " itens na lista:");
        imprimirLista(compras);
        System.out.println("Primeiro item: " + compras.get(0));
        System.out.println("Último item: " + compras.get(compras.size() - 1));
        // if (compras.contains("Carne")) {
        //     System.out.println("Já tenho carne na lista");
        // } else {
        //     System.out.println("Preciso adicionar carne.");
        // }
        System.out.println(compras.contains("Carne") ? "Já tenho carne na lita" : "Preciso adicionar carne");
        int pos = compras.indexOf("Pão");
        // if (pos != -1) {
        //     System.out.println("Pão esta na posição: " + pos);
        // } else {
        //     System.out.println("Pão não está na lista.");
        // }
        System.out.println(pos != -1 ? "Pão esta na posição: " + pos : "Pão não está na lista.");
        compras.remove("Macarrão");
        System.out.println("Restam " + compras.size() + " itens.");
        imprimirLista(compras);
    }

public static void imprimirLista(ArrayList<String> lista) {
    for (String item : lista) {
        System.out.println("- " + item);
    }
}
}
