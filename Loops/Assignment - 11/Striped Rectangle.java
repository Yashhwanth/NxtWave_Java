import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        for(int i = 1 ; i <= m ; i ++){
            if(i % 2 == 1) System.out.println("+ ".repeat(n));
            else System.out.println("- ".repeat(n));
        }
    }
}
