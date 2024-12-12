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
        }
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> high = new ArrayList<>();
        ArrayList<Integer> sum = new ArrayList<>();
        //Column 
        for(int i = 0 ; i < n ; i ++){
            int sum_of_elements = 0 ;
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;
            for(int j = 0 ; j < m ; j ++){
                int value = matrix[j][i];
                sum_of_elements = sum_of_elements + value;
                if(value < lowest) lowest = value;
                if(value > highest) highest = value;
            }
            low.add(lowest);
            high.add(highest);
            sum.add(sum_of_elements);
        }System.out.println(high);
        System.out.println(low);
        System.out.println(sum);
    }
}
