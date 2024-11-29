import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        Integer index = input.nextInt();
        Integer size = word.length();
        System.out.print(size>index ? word.substring(0,index)+word.substring(index+1) : word);
    }
}
