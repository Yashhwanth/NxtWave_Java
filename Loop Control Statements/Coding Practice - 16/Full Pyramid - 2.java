import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i ++){
            System.out.print(" ".repeat(n - i));
            for(int j = 1 ; j <= i ; j ++){
                System.out.print(j + " ");
            }System.out.println();
        }
    }
}
