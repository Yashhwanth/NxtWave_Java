import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0;
        for(int i = 0 ; i < n ; i ++){
            sum = sum + input.nextInt();
        }
        System.out.println(sum);
    }
}
