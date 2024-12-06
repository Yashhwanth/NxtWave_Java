import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String string = str.toLowerCase();
        String rev = "";
        for(int i = str.length() - 1 ; i >= 0 ; i --){
            rev = rev + string.charAt(i);
        }
        System.out.println(string.equals(rev) ? "True" : "False");
    }
}
