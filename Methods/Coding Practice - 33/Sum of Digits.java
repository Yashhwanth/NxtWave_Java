import java.util.*;
class main{
    static int sum(String number){
        int sum = 0 ;
        String[] list = number.split("");
        for(String num : list){
            sum += Integer.parseInt(num);
        }return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        int sum_of_digits = sum(number);
        System.out.println(sum_of_digits);
    }
}
