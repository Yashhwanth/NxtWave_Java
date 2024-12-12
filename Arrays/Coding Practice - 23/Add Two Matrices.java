import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] arr3 = new int[m][n];
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr1[i][j] = input.nextInt();
            }
        }
        for(int  i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr2[i][j] = input.nextInt();
            }
        }
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr3[i][j] = arr1[i][j] + arr2[i][j] ;
            }
        }
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                System.out.print(arr3[i][j] + " ");
            }System.out.println();
        }
    }
}
