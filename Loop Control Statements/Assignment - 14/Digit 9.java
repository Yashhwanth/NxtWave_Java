import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= 2 * n - 1 ; i ++){
            if(i == 1 || i == n || i == 2 * n - 1 ) System.out.println("* ".repeat(n));
            else if(i > 1 && i < n) System.out.println("* " + "  ".repeat(n - 2) + "*");
            else System.out.println("  ".repeat(n - 1) + "*");
        }
    }
}
