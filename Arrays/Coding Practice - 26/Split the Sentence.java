import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] list = line.split(" ");
        for(String fruit : list){
            System.out.println(fruit);
        }
    }
}
