import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int count = 0;
        for (int i = 0 ; i < str.length() ; i ++){
            if(Character.isDigit(str.charAt(i))){
                count = count + 1;
            }
        } System.out.println(count > 0 ? "Valid Password" : "Invalid Password");
    }
}
