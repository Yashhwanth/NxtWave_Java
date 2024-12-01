import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sides = input.nextInt();
        if(sides < 3) System.out.println("Not Polygon");
        if(sides == 3) System.out.println("Triangle");
        if(sides== 4) System.out.println("Quadrilateral");
        if(sides == 5) System.out.println("Pentagon");
        if(sides > 5) System.out.println("Big Polygon");
    }
}
