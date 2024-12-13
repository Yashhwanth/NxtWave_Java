import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] arr = input.nextLine().split(" ");
        String joined = String.join(",",arr);
        System.out.println(joined);
    }
}
