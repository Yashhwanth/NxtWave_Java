import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        if(((side1 + side2) > side3) && ((side3 + side2) > side1) && ((side1 + side3) > side2)){
            System.out.println("It's a Triangle");
        }else{
            System.out.println("It's not a Triangle");
        }
    }
}
