import com.ExamenLibreria.Division;
import com.ExamenLibreria.Multiplicacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {
    @Test
    public void divisionOfPositiveNumbersReturnsCorrectResult() {
        assertEquals(3, Division.dividir(9,3));
    }

    @Test
    public void divisionOfNegativeNumbersReturnsCorrectResult() {
        assertEquals(3, Division.dividir(-9, -3));
    }

    @Test
    public void divisionOfZeroAndPositiveNumberReturnsCorrectResult() {
        assertEquals(0, Division.dividir(0, 3));
    }

    @Test
    public void divisionOfZeroAndNegativeNumberReturnsCorrectResult() {
        assertEquals(0, Division.dividir(0, -3));
    }

    @Test
    public void divisionOfZeroAndZeroReturnsZero() {
        assertEquals(0, Division.dividir(0, 0));
    }
}
