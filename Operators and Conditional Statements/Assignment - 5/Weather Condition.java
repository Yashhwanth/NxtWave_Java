import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        float temp = input.nextFloat();
        if(temp < 0) System.out.println("Freezing weather");
        if(temp >= 0 && temp < 10) System.out.println("Very Cold weather");
        if(temp >= 10 && temp < 20) System.out.println("Cold weather");
        if(temp >= 20 && temp < 30) System.out.println("Normal");
        if(temp >= 30 && temp < 40) System.out.println("Hot");
        if(temp >= 40) System.out.println("Very Hot");
    }
}
