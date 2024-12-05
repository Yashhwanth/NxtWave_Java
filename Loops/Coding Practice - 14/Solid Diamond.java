import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i ++){
            System.out.println(" ".repeat(n - i) + "* ".repeat(i));
        }
        for(int i = 1 ; i <= n - 1 ; i++){
            System.out.println(" ".repeat(i) + "* ".repeat(n - i));
        }
    }
}
