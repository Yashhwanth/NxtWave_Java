import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int students = input.nextInt();
        System.out.println((students*(students - 1))/2);
    }
}
