import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float number = input.nextFloat();
        System.out.println((number < 0) ? ("Negative") : ("Positive"));
    }
}
