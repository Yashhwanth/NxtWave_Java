import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        if(day == 1) System.out.println("Monday");
        if(day == 2) System.out.println("Tuesday");
        if(day == 3) System.out.println("Wednesday");
        if(day == 4) System.out.println("Thursday");
        if(day == 5) System.out.println("Friday");
        if(day == 6) System.out.println("Saturday");
        if(day == 7) System.out.println("Sunday");
    }
}
