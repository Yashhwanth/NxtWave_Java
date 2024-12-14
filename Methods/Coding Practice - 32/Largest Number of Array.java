import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(",");
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < numbers.length ; i ++){
            int number = Integer.parseInt(numbers[i]);
            if(number > largest) largest = number;
        }System.out.println(largest);
    }
}
