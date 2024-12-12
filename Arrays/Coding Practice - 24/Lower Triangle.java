import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                matrix[i][j] = input.nextInt();
            }
        }for(int i = 0 ; i < m ; i ++){
            ArrayList<Integer> low_matrix = new ArrayList<>();
            for(int j = 0 ; j <= i ; j ++){
                if(j < n){
                    low_matrix.add(matrix[i][j]);
                }
            }System.out.println(low_matrix);
        }
    }
}
