package TimeInterval;

public class TimeIntervalRun {

    public static void main(String[] args) {
        TimeInterval timeInterval1 = new TimeInterval(30, 2, 0);
        System.out.println(timeInterval1.totalSeconds());

        TimeInterval timeInterval2 = new TimeInterval(timeInterval1.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();

        TimeInterval sumIntervals = timeInterval1.sum(timeInterval2);
        sumIntervals.print();
    }
}
