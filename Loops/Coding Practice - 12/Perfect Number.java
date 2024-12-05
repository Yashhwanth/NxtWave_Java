import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        for(int i = 1 ; i < number ; i ++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum == number ? "Perfect Number" : "Not a Perfect Number");
    }
}
