import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testCalculateSimpleExpression() {
        String expression = "10+5*4+3";
        String ocekivano = "33.0";
        String izracunato = Calculator.Run(expression);
        assertEquals(ocekivano, izracunato, "Rezultat izraza '10+5*4+3' treba da bude 33.0");
    }

}
