import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String number_str = input.nextLine();
        Integer number = Integer.parseInt(number_str);
        char first_char = number_str.charAt(0);
        char second_char = number_str.charAt(1);
        int first_num = Character.getNumericValue(first_char);
        int second_num = Character.getNumericValue(second_char);
        if( (number % 9 == 0) || ((first_num == 9) || (second_num == 9))){
            System.out.println("Lucky Number");
        }else System.out.println("Unlucky Number");

    }
}
