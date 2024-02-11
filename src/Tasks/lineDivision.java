package Tasks;

import java.util.Arrays;

public class lineDivision {

    public static void main(String[] args) {
        String str = "1234567890";
        int n = 3;
        String[] array = split(str, n);
        System.out.println(Arrays.toString(array));
    }

    private static String[] split(String str, int n) {
        int sizeArr = (int) Math.ceil(str.length() / (double) n);
        String[] array = new String[sizeArr];
        int counter = 0;
        for (int i = 0; i < str.length(); i += n) {
            int endIndex = Math.min(str.length(), i + n);
            String substring = str.substring(i, endIndex);
            array[counter] = substring;
            counter++;
        }

        return array;
    }

}
