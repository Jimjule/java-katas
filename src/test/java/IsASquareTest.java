import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsASquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, IsASquare.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)",    true,   IsASquare.isSquare(0));
        assertEquals("3 isn't a square number", false,  IsASquare.isSquare(3));
        assertEquals("4 is a square number (2 * 2)",    true,   IsASquare.isSquare(4));
        assertEquals("25 is a square number (5 * 5)",   true,   IsASquare.isSquare(25));
        assertEquals("26 isn't a square number",false,  IsASquare.isSquare(26));
    }
}