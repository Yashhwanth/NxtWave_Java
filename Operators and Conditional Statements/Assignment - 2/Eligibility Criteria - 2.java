import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int maths = input.nextInt();
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        System.out.println(((maths + physics) >= 100 || (physics + chemistry) >= 100 || (maths + chemistry) >= 100) ? (((maths + physics + chemistry) >= 180) ? "True" : "False") : "False");
    }
}
