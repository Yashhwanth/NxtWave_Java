import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String [] langs = {"Python", "Java","Ruby", "C", "C++", "Go", "R", "JavaScript", "Swift", "PHP", "Kotlin", "Perl"};
        int n = input.nextInt();
        for(int i = 0 ; i < n ; i ++){
            int x = input.nextInt();
            System.out.println(langs[x]);
        }
    }
}
