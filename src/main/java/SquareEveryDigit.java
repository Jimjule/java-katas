public class SquareEveryDigit {

    public int squareDigits(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        String squaredDigits = "";
        for (char digit: digits) {
            int digitToSquare = Character.getNumericValue(digit);
            squaredDigits += String.valueOf(digitToSquare * digitToSquare);
        }
        return Integer.parseInt(squaredDigits);
    }

}