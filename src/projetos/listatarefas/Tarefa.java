
public class Tarefa {

    private String titulo;
    private boolean concluida;

    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
        System.out.println("Tarefa concluída: " + titulo);
    }

    public void mostrar() {
        String status = concluida ? "x" : " ";
        System.out.println("[" + status + "] " + titulo);
    }

    public boolean isConcluida() {
        return concluida;
    }
}
