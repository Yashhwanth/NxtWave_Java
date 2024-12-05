import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for(int  i = 0 ; i < str.length() ; i ++){
            System.out.print(str.charAt(input.nextInt()));
        }
    }
}
