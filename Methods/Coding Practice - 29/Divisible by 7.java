import java.util.Scanner;

class Main {
    static String divisibleBySeven(int a)
    {
        // Write your code here
        if(a % 7 == 0) return "True";
        else return "False";
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // Call the function
        System.out.println(divisibleBySeven(a));
        sc.close();
    }
}
