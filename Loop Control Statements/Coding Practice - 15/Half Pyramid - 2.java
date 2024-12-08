import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int var = 1;
        for(int i = 1 ; i <= m ; i ++){
            for(int j = 0 ; j < i ; j ++){
                System.out.print(var + " ");
                var ++ ;
            }System.out.println();
        }
    }
}
