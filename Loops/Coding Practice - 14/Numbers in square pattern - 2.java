import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i ++){
            String j = String.valueOf(i);
            System.out.println((j + " ").repeat(n));
        }System.out.println();
    }
}
