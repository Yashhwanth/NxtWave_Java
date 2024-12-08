import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 2 ; i <= n ; i ++){
            boolean is_prime = true;
            for(int j = 2 ; j < i ; j ++){
                if(i % j == 0){
                    is_prime = false;
                    break;
                }
            }if(is_prime) System.out.println(i);
        }
    }
}
