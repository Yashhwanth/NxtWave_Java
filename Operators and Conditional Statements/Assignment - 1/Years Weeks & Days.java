import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int total_days = input.nextInt();
        int years = total_days/365;
        int weeks = (total_days%365)/7;
        int days = (total_days%365)%7;
        System.out.println(years);
              System.out.println(weeks);
        System.out.println(days);
  
    }
}
