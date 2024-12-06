import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0;
        for(int i = 2 ; i <= n ; i = i + 2){
            sum = sum + i;
        }System.out.println(sum);
    }
}
