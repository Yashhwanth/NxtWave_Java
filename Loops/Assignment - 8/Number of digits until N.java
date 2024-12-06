import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for(int  i = 1 ; i <= n ; i++){
            sum = sum + String.valueOf(i).length();
        }System.out.println(sum);
    }
}
