import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test // Numero
    public void deveTestarNumerosParaNaoDivisiveisPor3Ou5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("1", fizzBuzz.numeroFizzBuzz(1));
        Assert.assertEquals("71", fizzBuzz.numeroFizzBuzz(71));
    }
}