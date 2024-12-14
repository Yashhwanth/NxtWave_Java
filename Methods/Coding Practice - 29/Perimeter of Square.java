import java.util.*;
class Main {
    static int perimeterOfSquare(int side)
    {
        // Write your code here
        return side * 4;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);      
        int side= sc.nextInt();
        // Call the function
        System.out.println(perimeterOfSquare(side));
        sc.close();
    }
    
}
