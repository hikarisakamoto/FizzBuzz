public class FizzBuzz {
    protected String numeroFizzBuzz(int numero) {
        String fizzBuzzOuNumero = String.valueOf(numero);

        if (numero % 3 == 0) {
            fizzBuzzOuNumero = "Fizz";
        }


        return fizzBuzzOuNumero;
    }
}
