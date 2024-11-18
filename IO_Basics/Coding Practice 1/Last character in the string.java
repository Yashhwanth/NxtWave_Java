import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Integer length = str.length();
        System.out.println(str.charAt(length-1));
    }
}
