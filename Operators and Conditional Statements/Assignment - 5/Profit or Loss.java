import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int cp = input.nextInt();
        int sp = input.nextInt();
        System.out.println((sp > cp) ? ("Profit") : (((sp < cp) ? ("Loss") : ("No Profit - No Loss"))));
    }
}
