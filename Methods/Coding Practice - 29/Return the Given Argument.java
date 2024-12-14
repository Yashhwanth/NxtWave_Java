import java.util.Scanner;

class Main {

    static int getArg(int arg)
    {
        // Write your code here
        return arg;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Call the function
        System.out.println(getArg(n));
        sc.close();

    }
    
}
