import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i ++){
            if(i == 1) System.out.println(" ".repeat(n - i) + "*");
            else if(i == n) System.out.println("* ".repeat(n));
            else System.out.println(" ".repeat(n - i) + "* " + " ".repeat(2 * (i - 2)) + "* ");
        }
    }
}
