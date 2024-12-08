import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i < n + 1; i++) {
            String left_spaces = "";
            left_spaces += " ".repeat(n - i);
            if (i > 2 && i < n) 
            {
                String hollow_spaces = "";
                hollow_spaces += " ".repeat(2 * (i - 2));
                String numbers = "1 " + hollow_spaces + (String.valueOf(i) + " ");
                System.out.println(left_spaces + numbers);
            }  else 
            {
                String numbers = "";
                for (int j = 1; j < i + 1; j++)
                    numbers = numbers + (String.valueOf(j) + " ");
                System.out.println(left_spaces + numbers);
                }
        }

    }
}
