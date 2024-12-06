import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i ++){
            String spaces_at_start = "  ".repeat(n - i);
            if(i == 1) System.out.println("  ".repeat(n - 1) + "* ");
            else if(i == n) System.out.println("* ".repeat(n));
            else System.out.println(spaces_at_start + "* " + "  ".repeat(i - 2) +"* ");
        }
    }
}
