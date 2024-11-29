import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int p = input.nextInt();
        int c = input.nextInt();
        if ((m >= 35 && p >=35 && c >= 35) && ((m + p) >= 90 || (p + c) >= 90 || (m + c) >= 90))
        {
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
