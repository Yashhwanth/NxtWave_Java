import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        for(int i = 0 ; i < m ; i ++){
            if(i == 0 || i == m - 1){
                System.out.println("* ".repeat(n));
            }else System.out.println("* " + "  ".repeat(n - 2) + "* ");
        }
    }
}
