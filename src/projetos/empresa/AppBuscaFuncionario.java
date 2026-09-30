import java.util.*;

public class AppBuscaFuncionario {

    public static void main(String[] args) {
        HashMap<Integer, Funcionario> empresa = new HashMap<>();
        Funcionario flavio = new Funcionario("Flávio", 2500.00);
        Gerente silvia = new Gerente("Silvia", 5000.00, 0.2);
        Vendedor bruno = new Vendedor("Bruno", 2500.00, 0.5, 2000);
        Desenvolvedor sebastiao = new Desenvolvedor("Sebastião", 10000.00, "java", 0.8);
        empresa.put(123, flavio);
        empresa.put(126, silvia);
        empresa.put(8950, bruno);
        empresa.put(3322, sebastiao);

        apresentarMatricula(empresa, 8950);
        apresentarMatricula(empresa, 2316);

        for (Integer m : empresa.keySet()) {
            Funcionario f = empresa.get(m);
            System.out.println("Matrícula " + m + ": " + f.getNome());
        }
        empresa.remove(3322);
        System.out.println("Restaram " + empresa.size() + " matriculas");
        for (Map.Entry<Integer, Funcionario> entry : empresa.entrySet()) {
            Integer m = entry.getKey();
            Funcionario f = entry.getValue();
            System.out.println(m + ": " + f.getNome());
        }
    }

    public static Funcionario buscarPorMatricula(HashMap<Integer, Funcionario> empresa, int matricula) {
        if (empresa.containsKey(matricula)) {
            Funcionario f = empresa.get(matricula);
            return f;
        }
        return null;
    }

    public static void apresentarMatricula(HashMap<Integer, Funcionario> empresa, int matricula) {
        Funcionario f = buscarPorMatricula(empresa, matricula);
        if (f != null) {
            f.apresentar();
        } else {
            System.out.println("Matrícula não encontrada");
        }
    }
}
