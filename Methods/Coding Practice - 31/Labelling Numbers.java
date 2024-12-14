import java.util.Scanner;

class Main {

    static String showNumbers(int n) {
        // Write your code here
            if(n % 2 == 0) return n + " EVEN";
            else return n + " ODD";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // Call the function
        for(int i = 0 ; i <= n ; i ++){
            System.out.println(showNumbers(i));
        }

        sc.close();

    }

}
