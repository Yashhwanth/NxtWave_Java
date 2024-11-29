import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Integer number = input.nextInt();
        System.out.println((number>25 && number<75)?"True" : "False");
    }
}
