import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int breadth = input.nextInt();
        System.out.println(len == breadth ? "Square" : "Rectangle");
    }
}
