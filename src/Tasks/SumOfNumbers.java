package Tasks;

public class SumOfNumbers {

    // my solution
    public static int GetSum(int a, int b) {
        int sum = 0;
        if (b > a) {
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum = sum + i;
            }
        }
        return sum;
    }

    // solution from codewars
    public static int FromCodewars(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(SumOfNumbers.GetSum(0, 2));
        System.out.println(SumOfNumbers.GetSum(4, 2));

        System.out.println(SumOfNumbers.FromCodewars(0, 2));
        System.out.println(SumOfNumbers.FromCodewars(4, 2));
    }

}
