public class IsASquare {
    public static boolean isSquare(int n) {
        if (n > 0) {
            for (int i = 0; i * i <= n; i++) {
                if (i * i == n) {
                    return true;
                }
            }
            return false;
        } else if (n == 0) {
            return true;
        } else {
            return false;
        }
    }
}