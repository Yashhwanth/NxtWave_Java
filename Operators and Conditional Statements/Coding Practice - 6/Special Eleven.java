import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(((number % 11 ==0) || (number % 11 == 1)) ? ("Special Eleven") : ("Normal Number"));
    }
}
