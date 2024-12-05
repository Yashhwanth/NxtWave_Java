import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = "2";
        long sum = 0;
        for(int i = 1 ; i <= n ; i ++){
            sum = sum + Long.parseLong(str.repeat(i));
        }System.out.println(sum);
    }
}
