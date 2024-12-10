import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= 2 * n - 1 ; i ++){
            if(i < n){
                System.out.print(" ".repeat(n - i));
                for(int j = 1 ; j <= i; j ++){
                    System.out.print(j + " ");
                }System.out.println();
            }else{
                System.out.print(" ".repeat(i % n));
                for(int j = 1 ; j <= n - (i % n); j ++){
                    System.out.print(j + " ");
                }System.out.println();
            }
        }
    }
}
