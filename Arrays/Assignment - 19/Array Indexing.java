import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        int[] numbers = new int[n];
        int[] tcases = new int[t];
        for(int  i = 0 ; i < n ; i ++){
            numbers[i] = input.nextInt();
        }
        for(int i = 0 ; i < t ; i ++){
            int ki = input.nextInt();
            System.out.println(numbers[ki]);
        }
    }
}
