import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int length = string.length();
        for(int i = length - 1 ; i >= 0 ; i -- ){
            System.out.print(string.charAt(i));
        }
    }
}
