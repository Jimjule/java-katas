import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PangramChecker {
    public boolean check(String sentence){

        String lettersOnly = new String(sentence.replaceAll("[^A-z]", "").toLowerCase());
        List<String> mashed = Arrays.asList(lettersOnly.split("")).stream().distinct().collect(Collectors.toList());
        mashed.sort(Comparator.comparing(String::toString));

        String result = String.join("", mashed);
        String aToZ = "abcdefghijklmnopqrstuvwxyz";

        return result.equals(aToZ);
    }
}