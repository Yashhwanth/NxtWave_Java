import java.util.*;
class Main {

    static int MultiplyByThree(int a)
    {
        // Write your code here
        return a * 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // Call the function
        System.out.println(MultiplyByThree(a));
        sc.close();

    }
    
}
