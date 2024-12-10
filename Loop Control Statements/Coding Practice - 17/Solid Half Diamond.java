import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= 2 * n - 1 ; i ++){
            if(i <= n) System.out.println("* ".repeat(i));
            else System.out.println("* ".repeat(n - (i % n)));
        }
    }
}
