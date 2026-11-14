package main.day3;

import java.util.Arrays;


public class ArrayUtile {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];

        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max) max = arr[i];
        }
        return max;
    }

    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        if (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void executeRun(String runName, int[] inputArr, int searchTarget) {
        System.out.println("=========================================");
        System.out.println(" RUN: " + runName);
        System.out.println("=========================================");
        System.out.println(" Original Array : " + Arrays.toString(inputArr));
        System.out.println(" Min Element : " + findMin(inputArr));
        System.out.println(" Max Element : " + findMax(inputArr));

        int[] reversed = inputArr.clone();
        reverse(reversed);
        System.out.println(" Reversed Array : " + Arrays.toString(reversed));

        int[] sorted = inputArr.clone();
        Arrays.sort(sorted);
        int idx = binarySearch(sorted, searchTarget);
        System.out.println(" Sorted Array : " + Arrays.toString(sorted));
        System.out.println(" Binary Search ('" + searchTarget + "'): Index " + idx + (idx != -1 ? "[FOUND]" : " [NOT FOUND]"));
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample Run 1: Standard Unsorted Array
        executeRun("Sample Run 1 (Standard Elements)", new int[]{45, 12, 89, 33, 67, 21}, 33);
        // Sample Run 2: Negative Numbers & Duplicates
        executeRun("Sample Run 2 (Negatives & Duplicates)", new int[]{-15, 0, 42, -8, 42, -15}, -8);
        // Sample Run 3: Single-Element Array
        executeRun("Sample Run 3 (Single Element)", new int[]{100}, 100);

    }
}


