import java.util.*;
class main{
    public static void calculate_power(int a, int b){
        int power = 1;
        for(int i = 0 ; i < b ; i ++){
            power = power * a;
        }System.out.println(power);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        calculate_power(a, b);
    }
}
