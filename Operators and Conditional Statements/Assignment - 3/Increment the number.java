import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println((number > 10) ? (number + 5) : (number + 1));
    }
}
