import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        ArrayList<Integer> high = new ArrayList<>();
            ArrayList<Integer> low = new ArrayList<>();
            ArrayList<Integer> sum = new ArrayList<>();
        int[][] matrix = new int[m][n];
        for(int  i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                matrix[i][j] = input.nextInt();
            }
        }for(int[] row : matrix){
            int sum_of_elements = 0 ;
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;
            for(int values : row){
                sum_of_elements = sum_of_elements + values;
                if(values > highest){
                    highest = values;
                }
                if(values < lowest){
                    lowest = values;
                }
            }high.add(sum_of_elements);
            low.add(lowest);
            sum.add(highest);
            
        }System.out.println(sum);
        System.out.println(low);
        System.out.println(high);
    }
}
