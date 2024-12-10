import java.util.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int fac = 0;
        for(int i = n ; i > 0 ; i --){
            if(n % i == 0){
                fac ++;
                if(fac == k){
                    System.out.println(i);
                    break;
                } 
            }
        }
        if(fac < k) System.out.println(1);
    }
