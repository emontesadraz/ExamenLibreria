import com.ExamenLibreria.Suma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {
    @Test
    public void sumaOfPositiveNumbersReturnsCorrectResult() {
        assertEquals(5, Suma.sumar(2,3));
    }

    @Test
    public void sumaOfNegativeNumbersReturnsCorrectResult() {
        assertEquals(-5, Suma.sumar(-2, -3));
    }

    @Test
    public void sumaOfZeroAndPositiveNumberReturnsCorrectResult() {
        assertEquals(3, Suma.sumar(0, 3));
    }

    @Test
    public void sumaOfZeroAndNegativeNumberReturnsCorrectResult() {
        assertEquals(-3, Suma.sumar(0, -3));
    }

    @Test
    public void sumaOfZeroAndZeroReturnsZero() {
        assertEquals(0, Suma.sumar(0, 0));
    }
}
