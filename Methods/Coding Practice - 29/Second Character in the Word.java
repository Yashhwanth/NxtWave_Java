import java.util.*;
class Main {

    static Character secondChar(String a) {
        // Write your code here
        return a.charAt(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        // Call the function
        System.out.println(secondChar(n));
        sc.close();

    }

}
