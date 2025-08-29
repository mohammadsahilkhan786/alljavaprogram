//import java.util.*;
public class print_number_of_armstrong {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int dup = i;
            int count = 0;

            // count digits
            while (dup != 0) {
                count++;
                dup /= 10;
            }

            dup = i;
            int sum = 0;

            // sum of digit^count
            while (dup != 0) {
                int rem = dup % 10;
                sum += Math.pow(rem, count);
                dup /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
