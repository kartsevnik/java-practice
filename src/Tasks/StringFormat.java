package Tasks;

public class StringFormat {

    public static void main(String[] args) {
        String result = format("Mykola", "Kartsev", "Vyiacheslavovich");
        System.out.println(result);
    }

    public static String format(String firstName, String lastName, String patronymicName) {
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));

        // return firstNameChar + "." + lastNameChar + "." + patronymicNameChar;
        return String.format("%s.%s.%s", firstNameChar, lastNameChar, patronymicNameChar);
    }
}
