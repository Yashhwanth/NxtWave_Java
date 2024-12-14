import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] char_array = str.toCharArray();
        ArrayList<Integer> numbers_list = new ArrayList<>();
        int sum_of_numbers = 0;
        for(char ch : char_array){
            if(Character.isDigit(ch)) numbers_list.add(Character.getNumericValue(ch));
        }Collections.sort(numbers_list);
        for(int number : numbers_list){
            sum_of_numbers = sum_of_numbers + number;
        }
        System.out.println(sum_of_numbers);
        System.out.println(numbers_list.get(0));
        System.out.println(numbers_list.get(numbers_list.size() - 1));
    }
}
