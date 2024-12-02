import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();
        int rem;
        int hund = money / 100;
        rem = money % 100;
        int fifty = rem / 50;
        rem = rem % 50;
        int twen = rem / 20;
        rem = rem % 20;
        int ten = rem / 10;
        rem = rem % 10;
        System.out.println("100 Notes: "+hund);
        System.out.println("50 Notes: "+fifty);
        System.out.println("20 Notes: "+twen);
        System.out.println("10 Notes: "+ten);
    }
}
