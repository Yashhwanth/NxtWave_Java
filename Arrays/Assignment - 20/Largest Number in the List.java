import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");
        int largest = Integer.MIN_VALUE;
        for(String number : numbers){
            int num = Integer.parseInt(number);
            if(num > largest){
                largest = num;
            }
        }System.out.println(largest);
    }
}
