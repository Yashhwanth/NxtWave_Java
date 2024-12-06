import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0;
        String base = "1";
        for(int i = 1 ; i <= n ; i ++){
            sum = sum + Long.parseLong(base.repeat(i));
        }System.out.println(sum);
    }
}
