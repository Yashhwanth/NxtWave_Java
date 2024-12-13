import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String[] array = string.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        Collections.reverse(list);
        System.out.println(list);
    }
}
