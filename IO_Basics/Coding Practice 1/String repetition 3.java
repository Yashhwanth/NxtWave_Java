import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Integer num = input.nextInt();
        System.out.println(str.substring(str.length()-3).repeat(num));
    }
}