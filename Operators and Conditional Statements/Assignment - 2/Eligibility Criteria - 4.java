import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int p = input.nextInt();
        int c = input.nextInt();
        if (((m >=60 && p >=60 && c >= 60) && (m + p + c) >=180) || ((m + p >=120) || (c + p >=110))){
            System.out.println("True");
        }else System.out.println("False");
    }
}
