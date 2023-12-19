package Tasks;
// Implement the Gethiddencard () method, which accepts a credit card number (consisting of 16 digits) to the entrance)

// in the form of a line and returns its hidden version, which can be used on the site for display.
// If the source card had number 20343999002125581, then the hidden version looks like this **** 5581.
// In other words, the function replaces the first 12 characters, with stars.
// The number of stars is regulated by the second optional parameter.
// default value - 4.

// Реализуйте метод getHiddenCard(), который принимает на вход номер кредитки (состоящий из 16 цифр) 
// в виде строки и возвращает его скрытую версию, которая может использоваться на сайте для отображения. 
// Если исходная карта имела номер 2034399002125581, то скрытая версия выглядит так ****5581. 
// Другими словами, функция заменяет первые 12 символов, на звездочки. 
// Количество звездочек регулируется вторым необязательным параметром. 
// Значение по умолчанию — 4.

public class HiddenCard {
    // BEGIN (write your solution here)
    public static String getHiddenCard(String text, int length) {
        String star = "*".repeat((length == 0) ? 4 : length);

        var finNumber = text.substring((text.length() - 4), (text.length()));
        String result = star + finNumber;
        return result;
    }

    // способ использовать значения по умолчанию через добавление метода с меньшим
    // количеством параметров
    // way to use the default values through adding a method with less
    // number of parameters
    public static String getHiddenCard(String text) {
        String star = "*".repeat(4);

        var finNumber = text.substring((text.length() - 4), (text.length()));
        String result = star + finNumber;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(HiddenCard.getHiddenCard("1234567812345678", 2));
        System.out.println(HiddenCard.getHiddenCard("1234567812345678", 3));
        System.out.println(HiddenCard.getHiddenCard("2034399002121100"));
        System.out.println(HiddenCard.getHiddenCard("2034399002121100", 0));
    }
}