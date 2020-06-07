import java.util.stream.IntStream;

public class BetterThanAverage {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int average = (IntStream.of(classPoints).sum() + yourPoints) / (classPoints.length + 1);
        return yourPoints > average;
    }
}