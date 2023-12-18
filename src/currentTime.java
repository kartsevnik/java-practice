import java.time.LocalDate;

public class currentTime {

    public static void main(String[] args) {
        var currentDate = LocalDate.now();
        var text = "Today is: " + currentDate;
        System.out.println(text);
    }
}
