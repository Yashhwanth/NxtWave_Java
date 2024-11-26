import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Float kilometers = input.nextFloat();
        Integer meters = (int)(kilometers*1000);
        System.out.println(meters);
    }
}
