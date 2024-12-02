import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();
        int rem;
        int hun = money / 100;
        rem = money % 100;
        int fifty = rem / 50;
        rem = rem % 50;
        int ten = rem / 10;
        rem = rem % 10;
        int one = rem / 1;
        rem = rem % 1;
        System.out.println("100:"+hun);
        System.out.println("50:"+fifty);
        System.out.println("10:"+ten);
        System.out.println("1:"+one);
        
    }
}
