import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numbers_in_strings = input.nextLine().split(",");
        int position = input.nextInt();
        int[] numbers_in_int = new int[numbers_in_strings.length];
        for(int i = 0 ; i < numbers_in_strings.length ; i ++){
            int number = Integer.parseInt(numbers_in_strings[i]);
            numbers_in_int[i] = number;
        }Arrays.sort(numbers_in_int);
        System.out.println(numbers_in_int[position - 1]);
    }
}
