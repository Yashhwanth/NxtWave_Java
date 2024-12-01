import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 == num2) System.out.println("A == B");
        if(num1 > num2) System.out.println("A > B");
        if(num1 < num2) System.out.println("A < B");
    }
}
