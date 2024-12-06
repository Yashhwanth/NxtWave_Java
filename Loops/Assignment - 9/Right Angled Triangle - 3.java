import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("_".repeat(n + 1));
        for(int i = 1 ; i <= n ; i ++){
            System.out.println("|" + " ".repeat(n - i) + "/");
        }
    }
}
