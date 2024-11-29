import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.println(password.length()>7 ? "True" : "False");
    }
}
