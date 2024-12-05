import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int  n = input.nextInt();
        for(int i = 1 ; i <= m ; i ++){
            System.out.println((String.valueOf(i) + " ").repeat(n));
        }
    }
}
