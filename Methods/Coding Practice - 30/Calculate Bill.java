import java.util.*;
class Main {
    static double calculate_bill(int bill_amount){
        double discount = 0;
        if(bill_amount < 500) discount = bill_amount * 0.05;
        else if(bill_amount >= 500 && bill_amount < 2500) discount = bill_amount * 0.1;
        else if(bill_amount >= 2500) discount = bill_amount * 0.2;
        return bill_amount - discount;
    }
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        System.out.println(calculate_bill(amount));
    }
}
