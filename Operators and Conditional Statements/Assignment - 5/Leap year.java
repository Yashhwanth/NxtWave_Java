import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("True");
        }else System.out.println("False");
    }
}
