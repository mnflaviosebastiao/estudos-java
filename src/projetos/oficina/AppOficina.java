import java.util.HashMap;
import java.util.Map;

public class AppOficina {
    public static void main(String[] args) {
        HashMap<String, Servico> ordensDeServico = new HashMap<>();

        HashMap<Servico, String> novoTest = new HashMap<>();

        Lavagem unoMille = new Lavagem("Silvia", "fg56j7k", 350, 1, 100);
        Pintura civicSedan = new Pintura(8, 500, true, "Sebastiao", "ko98GH", 400);
        Revisao ninjaKawasaki = new Revisao(1, 45, "Flavio", "ass567h", 70);
        TrocaDeOleo hb20 = new TrocaDeOleo("castrol", 52, "Cristina", "rtk345", 89);
        Funilaria corolla = new Funilaria("Kaio", "qgu4537", 250, 2, 80);
        Lavagem corsa = new Lavagem("Cristina", "kgb45c9", 700, 2, 190);
        Lavagem camaro = new Lavagem("Cristina", "kgb45c9", 700, 2, 190);
        Lavagem palio = new Lavagem("Cristina", new String("kgb45c9"), 700, 2, 190);

        boolean igual = camaro.equals(corsa);

        if (igual == true) {
            System.out.println("é igual");
        } else {
            System.out.println("não é igual");
        }
        // esperado: é igual
        boolean comparaPalioCordsa = palio.equals(corsa);
        if (comparaPalioCordsa) {
            System.out.println("mesma placa");
        } else {
            System.out.println("placa diverge");
        }
        // esperado: mesma placa
        
        System.out.println(palio.getPlaca().hashCode());
        // esperado: -780443139

        ordensDeServico.put("OS-001", unoMille);
        ordensDeServico.put("OS-002", civicSedan);
        ordensDeServico.put("OS-003", ninjaKawasaki);
        ordensDeServico.put("OS-004", hb20);
        ordensDeServico.put("OS-005", corolla);

        novoTest.put(corsa, "0S-006");

        System.out.println(novoTest.get(palio));
        // esperado: 0S-006

        listarTodos(ordensDeServico);
        // esperado: OS-005 → Servico realizado para o cliente Kaio do veiculo com placa
        // qgu4537, status do servico: CHECK_IN, no valor total de 410.0, servico de
        // funilaria.
        // esperado: OS-002 → Servico realizado para o cliente Sebastiao do veiculo com
        // placa ko98GH, status do servico: CHECK_IN, no valor total de 7040.0, pintura
        // personalizada.
        // esperado: OS-001 → Servico realizado para o cliente Silvia do veiculo com
        // placa fg56j7k, status do servico: CHECK_IN, no valor total de 100.0, lavagem
        // premium.
        // esperado: OS-004 → Servico realizado para o cliente Cristina do veiculo com
        // placa rtk345, status do servico: CHECK_IN, no valor total de 141.0, troca
        // do(s) item(s): castrol.
        // esperado: OS-003 → Servico realizado para o cliente Flavio do veiculo com
        // placa ass567h, status do servico: CHECK_IN, no valor total de 115.0, revisao
        // com total de itens revisados de 1.
        System.out.println("O total somado do servicos é: R$ " + cobrancasTotais(ordensDeServico));
        // esperado: O total somado do servicos é: R$ 7806.0
        mostrarServico(ordensDeServico, "OS-003");
        // esperado: Servico realizado para o cliente Flavio do veiculo com placa
        // ass567h, status do servico: CHECK_IN, no valor total de 115.0, revisao com
        // total de itens revisados de 1
        mostrarServico(ordensDeServico, "OS-007");
        // esperado: Ordem de servico não existe.
        buscaPorServico(ordensDeServico, "OS-001").avancar();
        // esperado: Serviço movido para AVALIACAO.
        buscaPorServico(ordensDeServico, "OS-003").avancar();
        // esperado: Serviço movido para AVALIACAO.
        buscaPorServico(ordensDeServico, "OS-003").avancar();
        // esperado: Serviço movido para ORCAMENTO.
        buscaPorServico(ordensDeServico, "OS-003").avancar();
        // esperado: Serviço movido para AGUARDANDO_APROVACAO.
        buscaPorServico(ordensDeServico, "OS-003").avancar();
        // esperado: Serviço movido para AGUARDANDO_PECAS.
        buscaPorServico(ordensDeServico, "OS-003").avancar();
        // esperado: Serviço movido para MANUTENCAO.
        buscaPorServico(ordensDeServico, "OS-003").avancar();
        // esperado: Serviço movido para TESTE.
        buscaPorServico(ordensDeServico, "OS-003").avancar();
        // esperado: Serviço movido para PAGO.
        buscaPorServico(ordensDeServico, "OS-003").avancar();
        // esperado: Serviço movido para ENTREGUE.
        System.out.println("O total de ordens em aberto é: " + ordensEmAberto(ordensDeServico));
        // esperado: O total de ordens em aberto é: 4
        servicosComGarantia(ordensDeServico);
        // esperado: Ordem de servico: OS-005, com prazo de 180 dias de garantia,
        // Cobertura: Erros de colorimetria, Corrosão precoce, Defeitos estruturais e
        // alinhamento
        // esperado: Ordem de servico: OS-002, com prazo de 120 dias de garantia,
        // Cobertura: Defeitos de aplicação, bolhas, descascamento precoce ou corrosão.
        Status status = Status.CHECK_IN;
        System.out.println("O total de servicos com status " + status + " é: " + ordensStatus(ordensDeServico, status));
        // esperado: O total de servicos com status CHECK_IN é: 3
        buscaPorServico(ordensDeServico, "OS-001").recusar();
        // esperado: Nessa fase atual não é permitido recusar.
        buscaPorServico(ordensDeServico, "OS-002").avancar();
        // esperado: Serviço movido para AVALIACAO.
        buscaPorServico(ordensDeServico, "OS-002").avancar();
        // esperado: Serviço movido para ORCAMENTO.
        buscaPorServico(ordensDeServico, "OS-002").avancar();
        // esperado: Serviço movido para AGUARDANDO_APROVACAO.
        buscaPorServico(ordensDeServico, "OS-002").recusar();
        // esperado: Status atualizado para ORCAMENTO_RECUSADO.
    }

    public static void listarTodos(HashMap<String, Servico> ordensDeServico) {
        for (Map.Entry<String, Servico> entry : ordensDeServico.entrySet()) {
            String k = entry.getKey();
            Servico v = entry.getValue();
            System.out.println(k + " → " + v + ".");
        }
    }

    public static double cobrancasTotais(HashMap<String, Servico> ordensDeServico) {
        double total = 0;
        for (Map.Entry<String, Servico> entry : ordensDeServico.entrySet()) {
            Servico s = entry.getValue();
            total += s.getCobranca();
        }
        return total;
    }

    public static Servico buscaPorServico(HashMap<String, Servico> ordensDeServico, String ordem) {
        if (ordensDeServico.containsKey(ordem)) {
            return ordensDeServico.get(ordem);
        }
        return null;
    }

    public static void mostrarServico(HashMap<String, Servico> ordensDeServico, String ordem) {
        Servico servico = buscaPorServico(ordensDeServico, ordem);

        if (servico != null) {
            System.out.println(servico);
        } else {
            System.out.println("Ordem de servico não existe.");
        }
    }

    public static int ordensEmAberto(HashMap<String, Servico> ordensDeServico) {
        int total = 0;
        for (Map.Entry<String, Servico> entry : ordensDeServico.entrySet()) {
            Servico s = entry.getValue();
            if (!s.getStatus().isEncerrado()) {
                total++;
            }
        }
        return total;
    }

    public static void servicosComGarantia(HashMap<String, Servico> ordensDeServico) {
        for (Map.Entry<String, Servico> entry : ordensDeServico.entrySet()) {
            if (entry.getValue() instanceof Garantia g) {

                System.out.println("Ordem de servico: " + entry.getKey() + ", com prazo de " + g.prazo()
                        + " dias de garantia, Cobertura: " + g.garantia());
            }
        }
    }

    public static int ordensStatus(HashMap<String, Servico> ordensDeServico, Status status) {
        int total = 0;
        for (Map.Entry<String, Servico> entry : ordensDeServico.entrySet()) {
            Servico s = entry.getValue();
            if (s.getStatus() == status) {
                total++;
            }
        }
        return total;
    }
}