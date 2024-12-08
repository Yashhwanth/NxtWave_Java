import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0 ; i < n ; i ++){
            for(int j = n * i + 1 ; j <= n * (i + 1) ; j ++){
                System.out.print(j +  " ");
            }System.out.println();
        }
    }
}
