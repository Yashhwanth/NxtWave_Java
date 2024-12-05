import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int c1 = 0, c2 = 0, c3 = 0;
        for(int i = 0 ; i < str.length() ; i ++){
            if(Character.isUpperCase(str.charAt(i))) c1 = c1 + 1; 
            else if(Character.isLowerCase(str.charAt(i))) c2 = c2 + 1;
            else c3 = c3 + 1;
        }System.out.println((c1 > 0 && c2 > 0 && c3 > 0) ? "Valid Password" : "Invalid Password");
    }
}
