import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        for(int i = 0 ; i < m ; i ++ ){
            for(int j = 0 ; j < n ; j ++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
