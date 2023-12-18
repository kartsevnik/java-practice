public class comparison {
    public static void main(String[] args) {
        // Выделяется память
        var name1 = "Java";
        // Такая строка уже есть, поэтому подставляется ссылка на уже созданную строку
        // В результате экономится память
        var name2 = "Java";
        // Сравнение по ссылке
        // Обе переменные указывают на один участок памяти
        System.out.println(name1 == name2);
        // 1 true

        var otherName1 = "java".toUpperCase(); // "JAVA"
        // Выделяется новая память в любом случае
        var otherName2 = "java".toUpperCase(); // "JAVA"
        System.out.println(otherName1 == otherName2);// 2 false

        System.out.println(otherName1.equals(otherName2)); // 3 true);

    }
}
