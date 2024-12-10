import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i ++){
            System.out.println("* ".repeat(i) + "  ".repeat(2 * (n - i)) + "* ".repeat(i));
        }
        for(int j = n ; j > 0 ; j --){
            System.out.println("* ".repeat(j) + "  ".repeat(2 * (n - j)) + "* ".repeat(j));
        }
    }
}
