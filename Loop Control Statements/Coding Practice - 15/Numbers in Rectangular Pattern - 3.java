import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int var = 1;
        for(int i = 0 ; i < m ; i++){
            for( int j = 0 ; j < n ; j ++){
                System.out.print(var + " ");
                var ++ ;
            }System.out.println();
        }
    }
}
