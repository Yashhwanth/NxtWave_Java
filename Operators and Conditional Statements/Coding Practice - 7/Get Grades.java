import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Float marks = input.nextFloat();
        if(marks > 85) System.out.println("A");
        else if(marks > 70 && marks <=85) System.out.println("B");
        else if(marks >= 60 && marks <= 70) System.out.println("C");
        else System.out.println("F");
    }
}
