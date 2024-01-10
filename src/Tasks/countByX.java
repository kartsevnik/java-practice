package Tasks;

public class countByX {
    public static void main(String[] args) {
        int[] ret = countBy(2, 5);

        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i]);
        }
    }

    public static int[] countBy(int x, int n) {
        // Your code here
        int[] ret = new int[n];
        ret[0] = x;
        for (int i = 1; i <= n; i++) {
            ret[i - 1] = x * i;
        }
        return ret;
    }

}
