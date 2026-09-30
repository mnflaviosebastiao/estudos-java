

public class Filme {
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private int duracaoMinutos;

    public Filme(String titulo, String diretor, int anoLancamento, int duracaoMinutos) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.duracaoMinutos = duracaoMinutos;
    }
    public String getTitulo() {
        return titulo;
    }
    
    public String getDiretor() {
        return diretor;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
    public void apresentar() {
        System.out.println("\"" + getTitulo() + "\"" + " (" + getAnoLancamento() + ")" + " - Dirigido por " + getDiretor() + " - " + getDuracaoMinutos() + " min");
    }

}