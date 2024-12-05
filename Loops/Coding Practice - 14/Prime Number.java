import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean is_prime = true;
        for(int i = 2 ; i < number ; i ++){
            if(number % i == 0) is_prime = false;
        }System.out.println(is_prime ? "Prime Number" : "Not a Prime Number");
    }
}
