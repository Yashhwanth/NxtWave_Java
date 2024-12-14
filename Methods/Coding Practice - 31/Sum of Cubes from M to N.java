import java.util.Scanner;

class Main {
    static void sumOfCubesMToN(int a, int b) {
        // Write your code here
        long sum_of_cubes = 0 ;
        for(int  i = a ; i <= b; i ++){
            sum_of_cubes = sum_of_cubes + (i * i * i);
        }System.out.println(sum_of_cubes);
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Call the function
        sumOfCubesMToN(a, b);
        sc.close();
    }
    
}
