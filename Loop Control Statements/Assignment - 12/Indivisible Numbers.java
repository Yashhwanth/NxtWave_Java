import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0 ;
        for(int i = 1 ; i <= n ; i ++){
            boolean is_indivisible = true;
            for(int j = 2 ; j <= 10 ; j ++){
                if(i % j == 0){
                    is_indivisible = false;
                    break;
                }
            }if(is_indivisible) count ++ ;
        }System.out.println(count);
    }
}
