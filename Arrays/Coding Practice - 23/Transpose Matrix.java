import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        input.nextLine();
        int[][] arr1 = new int[m][n];
        int [][] arr2 = new int[n][m];
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr1[i][j] = input.nextInt();
            }
        }
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                arr2[i][j] = arr1[j][i];
            }
        }
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                System.out.print(arr2[i][j] + " ");
            }System.out.println();
        }
    }
}
