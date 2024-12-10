import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for(int i = 0 ; i < str.length() ; i ++){
            if(Character.isUpperCase(str.charAt(i))){
                System.out.println(str.charAt(i));
                break;
            } 
        }
    }
}
