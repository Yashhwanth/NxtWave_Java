import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= (2 * n) -1 ; i ++){
            if(i <= n) System.out.println(" ".repeat(n - i) + "* ".repeat(i));
            else if(i > n && i != (2 * n) -1) System.out.println(" ".repeat(i % n) + "* " + " ".repeat(2 * (n - (i % n) - 2)) + "*");
            else System.out.println(" ".repeat(i % n) + "* ");
        }
    }
}
