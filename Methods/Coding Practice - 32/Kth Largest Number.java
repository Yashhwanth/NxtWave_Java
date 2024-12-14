import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(",");
        int position = input.nextInt();
        Integer[] numberss = new Integer[numbers.length];
        for(int i = 0 ; i < numbers.length ; i ++){
            int number = Integer.parseInt(numbers[i]);
            numberss[i] = number;
        }
        Arrays.sort(numberss,Collections.reverseOrder());
        System.out.println(numberss[position - 1]);
    }
}
