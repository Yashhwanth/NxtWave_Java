import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int length = string.length();
        System.out.println(string.replace("-","/"));
    }
}
