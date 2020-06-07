public class EvenOrOdd {
    public static String even_or_odd(int number) {
        if(Math.round((double)number/2) == (double)number/2) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}