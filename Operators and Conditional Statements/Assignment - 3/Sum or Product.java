import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println((num1 + num2) < 10 ? (num1 + num2):(num1 * num2));
    }
}
