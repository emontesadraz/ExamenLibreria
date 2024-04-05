import com.ExamenLibreria.Resta;
import com.ExamenLibreria.Suma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaTest {
    @Test
    public void restaOfPositiveNumbersReturnsCorrectResult() {
        assertEquals(-1, Resta.restar(2,3));
    }

    @Test
    public void restaOfNegativeNumbersReturnsCorrectResult() {
        assertEquals(1, Resta.restar(-2, -3));
    }

    @Test
    public void restaOfZeroAndPositiveNumberReturnsCorrectResult() {
        assertEquals(-3, Resta.restar(0, 3));
    }

    @Test
    public void restaOfZeroAndNegativeNumberReturnsCorrectResult() {
        assertEquals(3, Resta.restar(0, -3));
    }

    @Test
    public void restaOfZeroAndZeroReturnsZero() {
        assertEquals(0, Resta.restar(0, 0));
    }
}
