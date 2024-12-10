import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0 ; i < n ; i ++){
            int num = input.nextInt();
            if(num == 1){
                continue;
            }
            boolean is_prime = true;
            for(int j = 2 ; j < num ; j ++){
                if(num % j == 0){
                    is_prime = false;
                }
            }if(is_prime){
                System.out.println(num);
                break;
            } 
        }
    }
}
