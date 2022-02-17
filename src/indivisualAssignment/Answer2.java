package indivisualAssignment;

import java.util.Scanner;

public class Answer2 {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the first number : ");
            int a = in.nextInt();
            System.out.print("Enter the second number: ");
            int b = in.nextInt();
            System.out.println("The result is : "+result(a, b));
        }
        public static int result(int x, int y)
        {
            if(x == y)
                return 0;
            if(x % 7 == y % 7)
                return (x < y) ? x : y;
            return (x > y) ? x : y;
        }
    }

