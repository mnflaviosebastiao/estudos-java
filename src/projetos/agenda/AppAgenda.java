
import java.util.HashMap;
import java.util.Map;

public class AppAgenda {

    public static void main(String[] args) {

        HashMap<String, Contato> agenda = new HashMap<>();
        Contato flavio = new Contato("+55 (84) 99848-8603", "flaviosebastiao302@gmail.com");
        Contato silvia = new Contato("+55 (84) 99158-3613", "silviacristina@gmail.com");
        Contato sebastiao = new Contato("+55 (81) 95978-3617", "sebastiaosilva@gmail.com");
        Contato marques = new Contato("+55 (84) 91008-9704", "marquesengenheiro@gmail.com");

        agenda.put("flavio", flavio);
        agenda.put("silvia", silvia);
        agenda.put("sebastiao", sebastiao);
        agenda.put("marques", marques);

        System.out.println("Total de contatos: " + agenda.size());

        listarAgenda(agenda);

        apresentarContato(agenda, "flavio");
        apresentarContato(agenda, "araujo");

        System.out.println(existeContato(agenda, "flavio"));
        System.out.println(existeContato(agenda, "araujo"));

        agenda.put("marques", new Contato("+55 (58) 98853-4521", "marquesengenheiro@gmail.com"));
        agenda.remove("sebastiao");

        listarAgenda(agenda);
    }

    public static Contato buscaContato(HashMap<String, Contato> agenda, String nome) {
        if (agenda.containsKey(nome)) {
            return agenda.get(nome);
        }
        return null;
    }

    public static void apresentarContato(HashMap<String, Contato> agenda, String nome) {
        Contato f = buscaContato(agenda, nome);
        if (f != null) {
            f.apresentar();
        } else {
            System.out.println("Usuário náo encontrado!");
        }
    }

    public static boolean existeContato(HashMap<String, Contato> agenda, String nome) {
        return agenda.containsKey(nome);
    }

    public static void listarAgenda(HashMap<String, Contato> agenda) {
        for (Map.Entry<String, Contato> entry : agenda.entrySet()) {
            String n = entry.getKey();
            Contato c = entry.getValue();
            System.out.println(n + ": Tel: " + c.getTelefone() + " | Email: " + c.getEmail());
        }
    }

}
