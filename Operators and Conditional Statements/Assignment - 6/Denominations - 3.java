import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();
        int rem;
        int h5 = money / 500;
        rem = money % 500;
        int fifty = rem / 50;
        rem = rem % 50;
        int ten = rem / 10;
        rem = rem % 10;
        int one = rem / 1;
        System.out.print("500: "+h5+" ");
        System.out.print("50: "+fifty+" ");
        System.out.print("10: "+ten+" ");
        System.out.print("1: "+one+" ");
    }
}
