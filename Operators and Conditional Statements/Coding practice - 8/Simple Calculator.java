import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char chara = str.charAt(0);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(chara == '+') System.out.println(num1 + num2);
        if(chara == '-') System.out.println(num1 - num2);
        if(chara == '*') System.out.println(num1 * num2);
        if(chara == '/') System.out.println((float)num1 / num2);
        if(chara == '%') System.out.println(num1 % num2);
    }
}
