package Tasks;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(ReverseString.reverse("Hexlet"));
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
}
