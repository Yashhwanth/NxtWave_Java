import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Integer number = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,10,20,35,5,50,20,100,200,10,150,100,100,20,20));
        int count = Collections.frequency(list,number);
        System.out.println(count);
    }
}
