public class FizzBuzz {
    private final String fizz = "Fizz";

    protected String numeroFizzBuzz(int numero) {
        String fizzBuzzOuNumero = String.valueOf(numero);

        if (numero % 3 == 0) {
            fizzBuzzOuNumero = fizz;
        }
        return fizzBuzzOuNumero;
    }
}
