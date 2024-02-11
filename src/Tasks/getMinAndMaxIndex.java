package Tasks;

public class getMinAndMaxIndex {
    public static void main(String[] args) {
        int[] values = {1, -100, 0, 356, 52, 3};

        System.out.println(findMinIndex(values));
        System.out.println(findMaxIndex(values));
    }

    public static int findMinIndex(int[] values) {
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < values[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[maxIndex] < values[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
