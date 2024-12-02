import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();
        int rem;
        int k2 = money / 2000;
        rem = money % 2000;
        int h5 = rem / 500;
        rem = rem % 500;
        int h2 = rem / 200;
        rem = rem % 200;
        int fifty = rem / 50;
        rem = rem % 50;
        int twen = rem / 20;
        rem = rem % 20;
        int five = rem / 5;
        rem = rem % 5;
        int two = rem / 2;
        rem = rem % 2;
        int one = rem / 1;
        rem = rem % 1;
        System.out.print("2000:"+k2+" ");
        System.out.print("500:"+h5+" ");
        System.out.print("200:"+h2+" ");
        System.out.print("50:"+fifty+" ");
        System.out.print("20:"+twen+" ");
        System.out.print("5:"+five+" ");
        System.out.print("2:"+two+" ");
        System.out.print("1:"+one);
    }
}
