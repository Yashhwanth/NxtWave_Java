import java.util.Scanner;

class Main {

    static void getLowerAndUpperCaseLetters(String s) {
        // Write your code here
        String uppercase = "";
        String lowercase = "";
        for(int i = 0 ; i < s.length() ; i ++){
            char character = s.charAt(i);
            if(Character.isUpperCase(character)) uppercase = uppercase + String.valueOf(character);
            else lowercase = lowercase + String.valueOf(character);
        }System.out.println(uppercase);
        System.out.println(lowercase);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // Call the function
        getLowerAndUpperCaseLetters(s);
        
        sc.close();

    }

}
