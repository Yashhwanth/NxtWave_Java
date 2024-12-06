import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean is_composite = false;
        for(int  i =2 ; i < n ; i ++){
            if(n % i == 0){
                is_composite = true;
            }
        }System.out.println(is_composite ? "True" : "False");
    }
}
