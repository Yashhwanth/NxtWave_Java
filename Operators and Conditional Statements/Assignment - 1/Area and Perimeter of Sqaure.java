import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        Integer side = input.nextInt();
        System.out.println("Area of the square is: "+side*side);
        System.out.println("Perimeter of the square is: "+side*4);
    }
}
