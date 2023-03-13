package Array.Pattern;

import java.util.Scanner;

public class VShapedPattern {
    public static void main(String[] args) {
        pattern(3);

    }

    static void pattern(int n) {
        int i, j;
        for (i = n - 1; i >= 0; i--) {
            // outer gap loop
            for (j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print(" * ");
            for (j = 1; j < (i * 2); j++)
                System.out.print(" ");
            if (i >= 1)
                System.out.print(" * ");
            System.out.print("\n");
        }
    }
}
 class StarPattern12 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the row size:");
        int i, j;
        int row_size = cs.nextInt();
        int print_control_x = 1;
        int print_control_y = row_size * 2 - 1;
        for (i = 1; i <= row_size; i++) {
            for (j = 1; j <= row_size * 2; j++) {
                if (j == print_control_x || j == print_control_y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            print_control_x++;
            print_control_y--;
            System.out.println();
        }

    }
}
