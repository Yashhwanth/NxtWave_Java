import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        int years = input.nextInt();
        if (years > 5){
            System.out.println(salary*0.05);
        }else{
            System.out.println("No bonus");
        }
    }
}
