import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int length = str.length();
        int sum = 0;
        int val;
        for(int i=0 ; i < length ; i ++ ){
            val = Character.getNumericValue(str.charAt(i));
            sum = sum + val;
        }
        System.out.print(sum);
    }
}
