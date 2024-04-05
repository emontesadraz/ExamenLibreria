import com.ExamenLibreria.Multiplicacion;
import com.ExamenLibreria.Resta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicacionTest {
    @Test
    public void multiplicacionOfPositiveNumbersReturnsCorrectResult() {
        assertEquals(6, Multiplicacion.multiplicar(2,3));
    }

    @Test
    public void multiplicacionOfNegativeNumbersReturnsCorrectResult() {
        assertEquals(6, Multiplicacion.multiplicar(-2, -3));
    }

    @Test
    public void multiplicacionOfZeroAndPositiveNumberReturnsCorrectResult() {
        assertEquals(0, Multiplicacion.multiplicar(0, 3));
    }

    @Test
    public void multiplicacionOfZeroAndNegativeNumberReturnsCorrectResult() {
        assertEquals(0, Multiplicacion.multiplicar(0, -3));
    }

    @Test
    public void multiplicacionOfZeroAndZeroReturnsZero() {
        assertEquals(0, Multiplicacion.multiplicar(0, 0));
    }
}
