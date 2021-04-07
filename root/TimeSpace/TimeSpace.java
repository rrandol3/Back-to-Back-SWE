package root.TimeSpace;

import root.Utility.*;

public class TimeSpace {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i]);
        }
        System.out.println();
        int ans = logTime(arr, 11);
        System.out.println(ans);
    }

    // O(1) - constant time
    public static void constantTime(int n) {
        // runs in constant time because we are not using n
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

    // O(N) - linear time
    public static void linear(int n) {
        // runs in linear time because we are using n
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
    }

    // O(N + M) - linear time
    public static void linear2(int n, int m) {
        // runs in linear time because we are using n + m
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < m; i++) {
            System.out.print(i + " ");
        }
    }

    // O(logN) - logarithmic time
    public static int logTime(int[] arr, int key) {
        // eg. Binary Search, because of the constant halving
        // also Heap of Tree structure is a good example
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                ans = mid;
                break;
            } else if (key > mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // O(NlogN) eg. merge sort, sorting in general, max heap
    public static LinkedListNode mergeSort(LinkedListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // LinkedListNode mid = getMiddleAndSplit(head);
        // LinkedListNode leftHalf = sortList(head);
        // LinkedListNode rightHalf = sortList(head);
        // merge leftHalf and rightHalf;
        return new LinkedListNode();
    }

    // O(N!)
    // runtime for permutation problems

    // O(V+E)
    // runtime for graph algorithms

    // Approximating Time Complexities of Recursive Functions
    // Assuming that a tree is complete and full, aka perfect binary tree, the time
    // complexity is O(2^N)
}
