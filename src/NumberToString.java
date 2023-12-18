public class NumberToString {

    public static void main(String[] args) {
        int number = 42;
        String strNumber = String.valueOf(number);
        String text = "This is a string: ";
        var result = strNumber instanceof String;
        System.out.println(text + result);
    }
}
