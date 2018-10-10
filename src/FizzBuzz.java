public class FizzBuzz {

    private final String fizz = "Fizz";
    private final String buzz = "Buzz";

    protected String numeroFizzBuzz(int numero) {
        String fizzBuzzOuNumero = String.valueOf(numero);
        // Teste para numero divisível por 3
        if (numero % 3 == 0) {
            fizzBuzzOuNumero = fizz;
        }
        // Teste para numero divisível por 5
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
        // Pode se trocar o valor fixo por um parametro do método
        int numeroFinalDaLista = 100;
        for (int i = 1; i <= numeroFinalDaLista; i++) {
            System.out.println(numeroFizzBuzz(i));
        }
    }

    private String numeroFizzBuzzStage2(int numero) {
        String fizzBuzzOuNumero = String.valueOf(numero);
        // Teste para numero divisível por 3
        if (numero % 3 == 0 || fizzBuzzOuNumero.contains("3")) {
            fizzBuzzOuNumero = fizz;
        }
        // Teste para numero divisível por 5
        if (numero % 5 == 0 || fizzBuzzOuNumero.contains("5")) {
            if (fizzBuzzOuNumero.equals(fizz)) {
                fizzBuzzOuNumero += buzz;
            } else {
                fizzBuzzOuNumero = buzz;
            }
        }
        return fizzBuzzOuNumero;
    }

    void gerarListaCompletaAte100FizzBuzzStage2() {
        // Pode se trocar o valor fixo por um parametro do método
        int numeroFinalDaLista = 100;
        for (int i = 1; i <= 100; i++) {
            System.out.println(numeroFizzBuzzStage2(i));
        }
    }
}
