import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch = input.nextLine().charAt(0);
        if(Character.isDigit(ch)) System.out.println("Digit");
        else if(Character.isUpperCase(ch)) System.out.println("Uppercase Letter");
        else if(Character.isLowerCase(ch)) System.out.println("Lowercase Letter");
        else System.out.println("Special Character");
    }
}
