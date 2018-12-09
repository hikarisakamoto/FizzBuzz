import java.util.LinkedHashMap;
import java.util.Map;

public class FizzBuzz {

    private Map<String, Integer> fizzBuzzPossibilidadesMap;

    public FizzBuzz() {
        fizzBuzzPossibilidadesMap = new LinkedHashMap<>();
        fizzBuzzPossibilidadesMap.put("FizzBuzz", 15);
        fizzBuzzPossibilidadesMap.put("Fizz", 3);
        fizzBuzzPossibilidadesMap.put("Buzz", 5);
    }

    protected String numeroFizzBuzz(int numero) {

        for (Map.Entry<String, Integer> entradaFizzBuzz : fizzBuzzPossibilidadesMap.entrySet()) {
            if (numero % entradaFizzBuzz.getValue() == 0)
                return entradaFizzBuzz.getKey();
        }
        return String.valueOf(numero);
    }
}
