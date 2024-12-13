import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] arr = input.nextLine().split(" ");
        long sum = 0 ;
        for(String n : arr){
            sum = sum + Integer.parseInt(n);
        }System.out.println(sum);
    }
}
