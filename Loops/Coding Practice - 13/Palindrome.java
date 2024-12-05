import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String str = string.toLowerCase();
        String rev_str = "";
        for (int i = str.length() -1 ; i >= 0 ; i --){
            rev_str =  rev_str + str.charAt(i)  ;
        }
        System.out.println(str.equals(rev_str) ? "Palindrome" : "Not a Palindrome");
    }
}
