import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0 ; i < n ; i ++){
            if(i == 0 ) System.out.println("* ".repeat(n));
            else if(i == n - 1) System.out.println(" ".repeat(i) + "*");
            else System.out.println(" ".repeat(i) + "*" + " ".repeat((2 * (n - i - 1)) - 1) + ("*"));
        }
    }
}
