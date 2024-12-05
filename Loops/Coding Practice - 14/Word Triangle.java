import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for(int i = 1 ; i <= str.length()  ; i ++){
                System.out.println(str.substring(0,i));
        }
    }
}
