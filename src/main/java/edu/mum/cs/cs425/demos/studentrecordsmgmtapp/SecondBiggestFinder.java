package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

public class SecondBiggestFinder {

    public static int findSecondBiggest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {19, 9, 11, 0, 12};
        System.out.println("Second biggest: " + findSecondBiggest(numbers)); // Should print 12
    }
}
