import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        long product = 1;
        for(int i = m ; i <= n ; i ++){
            product = product * i;
        }System.out.println(product);
    }
}
