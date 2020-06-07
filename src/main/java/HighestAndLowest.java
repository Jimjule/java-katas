public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        String[] split = numbers.split(" ");
        int high = Integer.parseInt(split[0]);
        int low = Integer.parseInt(split[0]);

        for(String num : split) {
            if(Integer.parseInt(num) > high) {
                high = Integer.parseInt(num);
            } else if (Integer.parseInt(num) < low) {
                low = Integer.parseInt(num);
            }
        }

        return (String.valueOf(high) + " " + String.valueOf(low));
    }
}