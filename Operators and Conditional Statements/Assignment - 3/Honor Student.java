import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rank = input.nextInt();
        System.out.println((rank < 10) ? ("HONOR STUDENT") : ("NORMAL STUDENT"));
    }
}
