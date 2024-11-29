import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        Integer maths = input.nextInt();
        Integer physics = input.nextInt();
        Integer chemistry = input.nextInt();
        System.out.println((maths >= 70 && physics >=60 && chemistry >=60) ? "True" : (((maths + physics + chemistry) >= 180) ? "True" : "False"));
    }
}
