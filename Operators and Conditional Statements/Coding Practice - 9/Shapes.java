import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int sides = input.nextInt();
        switch (sides){
            case 3:
                System.out.println("Triangle");
                break;
            case 4:
                System.out.println("Quadrilateral");
                break;
            case 5:
                System.out.println("Pentagon");
                break;
            case 6:
                System.out.println("Hexagon");
                break;
            default:
                System.out.println("Polygon");
        }
    }
}
