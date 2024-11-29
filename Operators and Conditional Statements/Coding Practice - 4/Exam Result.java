import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Integer marks = input.nextInt();
        System.out.println(marks > 50 ? "PASS" : "FAIL");
    }
}
