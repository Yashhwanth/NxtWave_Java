import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int greater = num1 > num2 ? num1 : num2;
        int smaller = num1 < num2 ? num1 : num2;
        if ((num1 ==6 || num2 == 6) || ((num1 + num2) ==6 || (greater - smaller) == 6)){
            System.out.println("Lucky");
        }else{
            System.out.println("Not Lucky");
        }
    }
}
