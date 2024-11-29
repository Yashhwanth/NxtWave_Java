import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        Integer word_len = word.length();
        System.out.println( String.valueOf(word.charAt(0)) + "*".repeat(word_len-2) + String.valueOf(word.charAt(word_len-1))  );
    }
}
