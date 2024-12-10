import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0 ; i < n ; i ++){
            int num = input.nextInt();
            if(num % 5 == 0) break;
            else System.out.println(num);
        }
    }
}
