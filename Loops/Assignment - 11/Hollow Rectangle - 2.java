import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        System.out.println("+" + "-".repeat(n) + "+");
        for(int i = 1 ; i <= m ; i++) System.out.println("|" + " ".repeat(n) + "|");
        System.out.println("+" + "-".repeat(n) + "+");
    }
}
