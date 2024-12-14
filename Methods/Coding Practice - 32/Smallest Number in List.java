import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(",");
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < numbers.length ; i ++){
            int number = Integer.parseInt(numbers[i]);
            if(number < smallest) smallest = number;
        }System.out.println(smallest);
    }
}
