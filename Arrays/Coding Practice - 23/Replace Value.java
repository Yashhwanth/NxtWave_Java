import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = input.nextInt();
            }
        }
        int x = input.nextInt();
        int y = input.nextInt();
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if(arr[i][j] == x) arr[i][j] = y;
            }
        }
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
}
