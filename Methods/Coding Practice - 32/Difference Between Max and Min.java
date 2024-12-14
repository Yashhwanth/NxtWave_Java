import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numbers_in_str = input.nextLine().split(",");
        int length = numbers_in_str.length;
        int[] numbers_in_int = new int[length];
        for(int i = 0 ; i < length ; i ++){
            int number = Integer.parseInt(numbers_in_str[i]);
            numbers_in_int[i] = number;
        }Arrays.sort(numbers_in_int);
        System.out.println(numbers_in_int[length - 1] - numbers_in_int[0]);
    }
}
