import java.util.*;
class main{
    static long calculate_factorial(long a){
        long fact = 1;
        for(long i = a ; i > 0 ; i --){
            fact = fact * i;
        }return fact;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        long factorial = calculate_factorial(number);
        System.out.println(factorial);
    }
}
