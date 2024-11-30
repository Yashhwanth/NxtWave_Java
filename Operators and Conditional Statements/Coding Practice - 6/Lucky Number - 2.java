import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Integer number = input.nextInt();
        System.out.println(((number % 6 == 0) ? ("Number is divisible by 6") : ((number % 3 == 0) ? ("Number is divisible by 3") : ((number % 2 == 0) ? ("Number is divisible by 2") : ("Number is not divisible by 2, 3 or 6")))));
    }
}
