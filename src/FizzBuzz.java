public class FizzBuzz {

    private final String fizz = "Fizz";
    private final String buzz = "Buzz";

    protected String numeroFizzBuzz(int numero) {
        String fizzBuzzOuNumero = String.valueOf(numero);

        fizzBuzzOuNumero = validarFizz(numero, fizzBuzzOuNumero);
        fizzBuzzOuNumero = validarBuzz(numero, fizzBuzzOuNumero);

        return fizzBuzzOuNumero;
    }

    private String validarFizz(int numero, String fizzBuzzOuNumero) {
        if (numero % 3 == 0) {
            fizzBuzzOuNumero = fizz;
        }
        return fizzBuzzOuNumero;
    }

    private String validarBuzz(int numero, String fizzBuzzOuNumero) {
        if (numero % 5 == 0) {
            if (fizzBuzzOuNumero.equals(fizz)) {
                fizzBuzzOuNumero += buzz;
            } else {
                fizzBuzzOuNumero = buzz;
            }
        }
        return fizzBuzzOuNumero;
    }

    public void gerarListaCompletaAte100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(numeroFizzBuzz(i));
        }
    }
}
