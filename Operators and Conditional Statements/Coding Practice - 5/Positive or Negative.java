import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num<0 ? "Negative" : (num==0) ? "Zero" : "Positive");
    }
}
