import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FizzBuzzTestParametrizado {
    private final int numero;
    private final String resultadoEsperado;
    private FizzBuzz fizzBuzz;

    public FizzBuzzTestParametrizado(int numero, String resultadoEsperado) {
        this.numero = numero;
        this.resultadoEsperado = resultadoEsperado;
    }

    @Parameterized.Parameters
    public static Collection fizzBuzzNumeros() {
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {3, "Fizz"},
                {5, "Buzz"},
                {15, "FizzBuzz"}
        });
    }

    @Before
    public void initialize() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testarNumeroFizzOuBuzzOuFizzBuzz() {
        Assert.assertEquals(resultadoEsperado, fizzBuzz.numeroFizzBuzz(numero));
    }
}
