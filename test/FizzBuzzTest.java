import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test // Numero
    public void deveTestarNumerosParaNaoDivisiveisPor3Ou5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("1", fizzBuzz.numeroFizzBuzz(1));
        Assert.assertEquals("71", fizzBuzz.numeroFizzBuzz(71));
    }

    @Test // Fizz
    public void deveTestarFizzParaNumerosDivisiveisApenasPor3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("Fizz", fizzBuzz.numeroFizzBuzz(3));
        Assert.assertEquals("Fizz", fizzBuzz.numeroFizzBuzz(33));
        Assert.assertEquals("Fizz", fizzBuzz.numeroFizzBuzz(99));
    }
}