import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int small_number = m > n ? n : m;
        int gcd = 1;
        for(int i = 2 ; i <= small_number ; i ++){
            if(m % i == 0 && n % i == 0){
                gcd = i;
            }
        }System.out.println(gcd);
    }
}
