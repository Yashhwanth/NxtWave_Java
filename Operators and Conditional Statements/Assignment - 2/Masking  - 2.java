import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        Integer size = string.length();
        System.out.println(string.substring(0,2) + "*".repeat(size-4) + string.substring(size-2));
    }
}
