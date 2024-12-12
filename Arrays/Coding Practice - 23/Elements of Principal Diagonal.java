import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr = new int[m][n];
        int diag = (m < n ? m : n);
        int [] arr1 = new int[diag];
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = input.nextInt();
            }
        }
        for(int i = 0 ; i < diag ; i ++){
            arr1[i] = arr[i][i];
        }System.out.println(Arrays.toString(arr1));
    }
}
