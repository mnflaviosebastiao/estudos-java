
import java.util.ArrayList;

public class AppListaTarefa {

    public static void main(String[] args) {
        ArrayList<Tarefa> lista = new ArrayList<>();
        Tarefa estudar = new Tarefa("Estudar java");
        Tarefa compraoPao = new Tarefa("Comprar pão");
        Tarefa lavarCarro = new Tarefa("Lavar carro");
        Tarefa pagarConta = new Tarefa("Pagar contas de luz");
        Tarefa treinar = new Tarefa("treinar");

        lista.add(estudar);
        lista.add(compraoPao);
        lista.add(lavarCarro);
        lista.add(pagarConta);
        lista.add(treinar);

        // Tarefa[] lista = {estudar, compraoPao, lavarCarro, pagarConta, treinar};

        for (Tarefa tarefa : lista) {
            tarefa.mostrar();
        }

        lista.get(1).concluir();
        lista.get(3).concluir();

    for (Tarefa tarefa : lista) {
        tarefa.mostrar();
    }

    int concluidas = 0;
    for (Tarefa tarefa : lista) {
        if(tarefa.isConcluida()) {
            concluidas++;
        }
    }
    System.out.println("Total: " + concluidas + " de " + (lista.size()) + " tarefas concluidas.");

    }
}
