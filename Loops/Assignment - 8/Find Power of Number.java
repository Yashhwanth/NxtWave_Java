import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        long power = 1;
        for(int i = 0 ; i < m ; i++){
            power = power * n;
        }System.out.println(power);
    }
}
