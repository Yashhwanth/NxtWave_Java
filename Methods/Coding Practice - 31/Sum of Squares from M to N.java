import java.util.Scanner;

class Main {

    static void sumOfSquaresMToN(int a, int b) {
        // Write your code here
        long sum = 0;
        for(int i = a ; i <= b ; i ++){
            sum = sum + i * i;
        }System.out.println(sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumOfSquaresMToN(a,b);
        // Call the function

        sc.close();
    }

}
