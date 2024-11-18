import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(Character.getNumericValue(str.charAt(0))+Character.getNumericValue(str.charAt(1))+Character.getNumericValue(str.charAt(2)));
    }
}
