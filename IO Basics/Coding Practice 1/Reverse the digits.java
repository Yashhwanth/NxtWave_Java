import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        
        
        System.out.print(String.valueOf(str.charAt(1))+String.valueOf(str.charAt(0)));
    }
}
