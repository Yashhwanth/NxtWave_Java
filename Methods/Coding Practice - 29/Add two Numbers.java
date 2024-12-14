import java.util.*;
class Main {

    static int add(int a, int b) {
        // Write your code here
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Call the function
        System.out.println(add(a, b));
        sc.close();
    }

}
