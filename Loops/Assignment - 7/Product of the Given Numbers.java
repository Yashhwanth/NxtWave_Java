import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long product = 1;
        for(int i = 0 ; i < n ; i ++){
            product = product * input.nextInt();
        }System.out.println(product);
    }
}
