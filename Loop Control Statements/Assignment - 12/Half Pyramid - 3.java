import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int start_num = input.nextInt();
        int k = input.nextInt();
        for(int i = 1 ; i <= k ; i ++){
            for(int j = 1 ; j <= i ; j ++){
                System.out.print(start_num + " ");
                start_num ++ ;
            }System.out.println();
        }
    }
}
