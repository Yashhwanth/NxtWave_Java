import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i ++){
            System.out.println("0 ".repeat(n - i) + "1 ".repeat((2 * i) - 1) + ("0 ".repeat(n - i)));
        }
    }
}
