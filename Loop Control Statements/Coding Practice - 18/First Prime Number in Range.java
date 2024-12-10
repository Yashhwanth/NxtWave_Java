import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int count = 0;
        for(int i = (m == 1) ? 2 : m ; i <= n ; i++){
            boolean is_prime = true;
            for(int j = 2 ; j < i ; j ++){
                if(i % j == 0){
                    is_prime = false;
                    break;
                }
            }if(is_prime){
                System.out.println(i);
                count ++;
                break;
            }
        }if(count == 0) System.out.println("No prime numbers in the given range");
    }
}
