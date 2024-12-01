import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        if(time >= 4 && time < 12) System.out.println("Good Morning");
        else if(time >= 12 && time < 16) System.out.println("Good Afternoon");
        else if(time >= 16 && time < 20) System.out.println("Good Evening");
        else System.out.println("Good Night");
    }
}
