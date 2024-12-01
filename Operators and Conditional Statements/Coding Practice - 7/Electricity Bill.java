import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int units = input.nextInt();
        double bill = 0;
        if(units > 0 && units <= 50){
            bill = bill + units * 2;
        }
        else if(units > 50 && units <= 150){
            bill = 100 + (units - 50) * 3;
        }
        else if(units > 150 && units <= 250){
            bill = 400 + (units - 150) * 5;
        }
        else if(units > 250 ){
            bill = 900 + (units - 250) * 8;
        }
        bill = bill + bill * 0.2;
        System.out.println(bill);
    }
}
