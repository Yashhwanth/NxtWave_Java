import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i ++){
            System.out.println(". ".repeat(n - i) + "0 ".repeat(2 * i - 1) + ". ".repeat(n - i));
        }
    }
}
