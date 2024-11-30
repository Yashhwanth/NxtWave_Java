import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String number_str = input.nextLine();
        int number = Integer.parseInt(number_str);
        char first_digit_str = number_str.charAt(0);
        char second_digit_str = number_str.charAt(1);
        int first_digit = Character.getNumericValue(first_digit_str);
        int second_digit = Character.getNumericValue(second_digit_str);
        if(((first_digit + second_digit) == 7) || (first_digit == 7 || second_digit == 7) || (number % 7 == 0)){
            System.out.println("Special Number");
        }else   System.out.println("Normal Number");

    }
}
