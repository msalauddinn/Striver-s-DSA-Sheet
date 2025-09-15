package Basic;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int origNum = num;
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println(origNum + " has " + count + " digits");
     }
}
