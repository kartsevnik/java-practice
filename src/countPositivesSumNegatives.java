// Given an array of integers, return a new array with each value doubled
// Дается массив целых чисел, верните новый массив с каждым удвоенным значением.

// Given an array of integers.
// Return new array, where the first element is the count of positives numbers
// and the second element is sum of negative numbers.
// 0 is neither positive not negative\

// Дается массив целых чисел.
// Возвращается новый массив, в котором первый элемент - счетчик положительных
// чисел.
// а второй элемент - сумма отрицательных чисел.
// 0 не является ни положительным, ни отрицательным числом

import java.util.Random;

public class countPositivesSumNegatives {
    private static final int ARRAY_SIZE = 20;
    private static final int MIN_RANDOM = -100;
    private static final int MAX_RANDOM = 100;
    private static final Random randomGenerator = new Random();

    public static int randomNumber(int minNum, int maxNum) {
        return randomGenerator.nextInt(maxNum - minNum + 1) + minNum;
    }

    public static int[] createArray() {
        int[] numbers = new int[ARRAY_SIZE];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = countPositivesSumNegatives.randomNumber(MIN_RANDOM, MAX_RANDOM);
        }

        return numbers;
    }

    public static int[] multiplyElementsByTwo(int[] array) {
        int[] numbers = array;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        return numbers;
    }

    public static int[] calculateSum(int[] array) {
        if (array == null || array.length == 0) {
            int[] emptyArray = {};
            return emptyArray;
        }
        int[] newArray = new int[2];
        int[] numbers = array;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                newArray[0] = newArray[0] + numbers[i];
            } else if ((numbers[i] < 0 || numbers[i] == 0))
                newArray[1] = newArray[1] + numbers[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = countPositivesSumNegatives.createArray();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + " num of arr: " + numbers[i]);
        }

        countPositivesSumNegatives.multiplyElementsByTwo(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + " num of arr: " + numbers[i]);
        }

        int[] newArray = countPositivesSumNegatives.calculateSum(numbers);
        System.out.println("Sum of positive numbers of arr: " + newArray[0]);
        System.out.println("Sum of negative numbers of arr: " + newArray[1]);

    }

}

// Solution from codewars

// public class Kata
// {
// public static int[] countPositivesSumNegatives(int[] input)
// {
// if (input == null || input.length == 0) {
// int[] emptyArray = {};
// return emptyArray;
// }
// int count = 0;
// int sum = 0;
// for (int i = 0; i < input.length; i++) {
// if (input[i] > 0) {
// count++;
// } else if (input[i] < 0) {
// sum += input[i];
// }
// }
// int[] returnValues = new int[] {count, sum};
// return returnValues;
// }