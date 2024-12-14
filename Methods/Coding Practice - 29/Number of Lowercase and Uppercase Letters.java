import java.util.*;
class Main {

    static void CountOfLowercaseAndUppercaseLetters(String str)
    {
        // Write your code here
        int lowercase_letters = 0 ;
        int uppercase_letters = 0 ;
        for(int i = 0 ; i < str.length() ; i ++){
            if(Character.isLowerCase(str.charAt(i))) lowercase_letters ++ ;
            else uppercase_letters ++ ;
        }System.out.println(uppercase_letters);
        System.out.println(lowercase_letters);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);      
        String chars= sc.nextLine();
        // Call the function
        CountOfLowercaseAndUppercaseLetters(chars);
        sc.close();
    }
    
}
