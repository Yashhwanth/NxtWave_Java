import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Str = input.nextLine();
        Integer index = input.nextInt();
        System.out.println(Str.charAt(index));
    }
}
