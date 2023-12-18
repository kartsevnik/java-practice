public class comparison {
    public static void main(String[] args) {
        // Выделяется память
        // Memory is allocated
        var name1 = "Java";
        // Такая строка уже есть, поэтому подставляется ссылка на уже созданную строку
        // В результате экономится память
        // Such a line is already there, so a link to the already created line is set
        // The memory is saved as a result

        var name2 = "Java";
        // Сравнение по ссылке
        // Обе переменные указывают на один участок памяти
        // Comparison by link
        // both variables indicate one section of memory
        System.out.println(name1 == name2); // 1 true

        var otherName1 = "java".toUpperCase(); // "JAVA"
        // Выделяется новая память в любом случае
        // A new memory is allocated in any case
        var otherName2 = "java".toUpperCase(); // "JAVA"
        System.out.println(otherName1 == otherName2);// 2 false

        System.out.println(otherName1.equals(otherName2)); // 3 true);
    }
}
