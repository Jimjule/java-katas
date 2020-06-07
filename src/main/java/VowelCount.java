import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {

    public static int getCount(String str) {
        Pattern pattern = Pattern.compile("[AaEeIiOoUu]");
        Matcher matcher = pattern.matcher(str);
        return (int)matcher.results().count();
    }

}
