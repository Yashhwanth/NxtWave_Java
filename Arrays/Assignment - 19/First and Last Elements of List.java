import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[4];
        int j = 0 ;
        for(int i = 0 ; i < n ; i ++){
            arr[i] = input.nextInt();
            if(i == 0 || i == 1 || i == n - 1 || i == n - 2){
                arr1[j] = arr[i];
                j ++ ;
            } 
        }System.out.println(Arrays.toString(arr1));
    }
}
