import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        if (side1 + side2 + side3 ==180){
            System.out.println("It's a Triangle");
        }else{
            System.out.println("It's not a Triangle");
    }
}
}
