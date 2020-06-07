import java.util.stream.*;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        return (IntStream.of(array).sum() % 2 == 0 ? "even" : "odd");
    }
}