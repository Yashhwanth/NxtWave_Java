import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String rev = "";
        for(int i = 0 ; i < str.length() ; i ++){
            if(Character.isUpperCase(str.charAt(i))) rev = rev + Character.toLowerCase(str.charAt(i));
            else rev = rev + Character.toUpperCase(str.charAt(i));
        }System.out.println(rev);
    }
}
