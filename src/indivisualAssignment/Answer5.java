package indivisualAssignment;
import java.util.Arrays;
import java.util.Scanner;
public class Answer5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of an Array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter value no." + i + ": ");
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Enter value you want to search: ");
            int SearchValue = sc.nextInt();
            SearchBinary(arr, SearchValue);
        }
        public static void SearchBinary(int[] arr, int SearchValue) {
            boolean flag = false;
            int first = 0;
            int last = arr.length - 1;
            while (first <= last) {
                int mid = (first + last) / 2;
                if (arr[mid] == SearchValue) {
                    flag = true;
                    break;
                } else if (arr[mid] > SearchValue) {
                    last = mid - 1;
                } else
                    first = mid + 1;
            }
            if (flag)
                System.out.println("Value found");
            else
                System.out.println("Value not found");
        }
    }