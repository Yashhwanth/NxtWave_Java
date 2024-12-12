import java.util.*;
import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] arr = new String[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = input.nextLine();
            // System.out.println(arr[i]);
            // System.out.println(i);
        }
        for(int i = n - 1  ; i >= 0 ; i --){
            System.out.println(arr[i]);
        }
    }
}
