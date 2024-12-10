import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("* ".repeat(2 * n - 1));
        for(int  i = 1 ; i <= n - 1 ; i ++){
            System.out.println(" ".repeat(i) + "* ".repeat(n - i) + " ".repeat(2 * (i - 1)) + "* ".repeat(n - i));
        }
    }
}
