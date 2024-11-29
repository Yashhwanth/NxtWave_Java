import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println((age >= 18) ? "Eligible" : "Not Eligible");
    }
}
