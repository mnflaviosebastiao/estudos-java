
import java.util.HashMap;

public class Aula11HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("Flávio", 31);
        idades.put("Silvia", 30);
        idades.put("Sebastião", 25);
        idades.put("Cristina", 26);
        System.out.println("Total de pessoas: " + idades.size());
        Integer idade = idades.get("Flávio");  
        System.out.println("Flavio tem " + idade + " anos");      
    }
}
