import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        String msg = input.nextLine();
        int num = input.nextInt();
        System.out.println((msg+" ").repeat(num));
    }
}