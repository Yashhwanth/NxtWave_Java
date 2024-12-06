import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        string = string.toLowerCase().replace(" ","").replace("'","");
        boolean is_palindrome = true;
        int i = 0;
        int j = string.length() - 1;
        while(i <= j){
            if(string.charAt(i) == string.charAt(j)){
                i = i + 1;
                j = j - 1;
            }else{
                is_palindrome = false;
                break;
            }
        }System.out.println(is_palindrome ? "True" : "False");
    }
}
