public class FizzBuzz {
    private final String fizz = "Fizz";
    private final String buzz = "Buzz";


    protected String numeroFizzBuzz(int numero) {
        String fizzBuzzOuNumero = String.valueOf(numero);

        if (numero % 3 == 0) {
            fizzBuzzOuNumero = fizz;
        }
        if (numero % 5 == 0) {
            if (fizzBuzzOuNumero.equals(fizz)) {
                fizzBuzzOuNumero += buzz;
            } else {
                fizzBuzzOuNumero = buzz;
            }
        }
        return fizzBuzzOuNumero;
    }
}
