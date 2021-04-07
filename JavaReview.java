import java.util.ArrayList;
import java.util.List;

public class JavaReview {
    public static void main(String[] args) {
        listExample();
    }

    // array example
    public static void arrayExample() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // list example
    public static void listExample() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}