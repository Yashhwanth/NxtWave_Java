import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int row = 1; row < n + 1; row++) {
            String hollowSpaces = "", left_spaces = "";
            int i = n - (row - 1);
            left_spaces += " ".repeat(row - 1);
            if (i > 2 && i < n) {
                hollowSpaces += "  ".repeat(i - 2);
                String numbers = "1 " + hollowSpaces + i + " ";
                System.out.println(left_spaces + numbers);
            }else{
                String numbers = "";
                for (int j = 1; j < i + 1; j++)
                    numbers = numbers + j + " ";
                System.out.println(left_spaces + numbers);

            }
        }
    }
}
