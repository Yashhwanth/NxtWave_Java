import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0 ; i < 2 * n + 1 ; i ++){
            if(i % n == 0) System.out.println("* ".repeat(n));
            else System.out.println("* " + "  ".repeat(n - 2) + "* ");
        }
    }
}
