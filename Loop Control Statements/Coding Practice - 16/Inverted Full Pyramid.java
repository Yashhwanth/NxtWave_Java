import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0 ; i < n ; i ++){
            System.out.println(" ".repeat(i) + "* ".repeat(n - i));
        }
    }
}