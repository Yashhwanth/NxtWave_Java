import java.util.*;
import java.text.DecimalFormat;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String[] numbers = input.nextLine().split(" ");
        int sum = 0;
        int no_of_numbers = 0;
        for(String num : numbers){
            sum = sum + Integer.parseInt(num);
            no_of_numbers ++;
        }
        double average = (double) sum / no_of_numbers;
        DecimalFormat df = new DecimalFormat("#0.0#");
        System.out.printf(df.format(average));
    }
}
