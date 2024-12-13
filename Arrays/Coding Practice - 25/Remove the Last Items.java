import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        int length = list.size();
        for(int i = length - 1 ; i >= length - count ; i --){
            list.remove(i);
        }System.out.println(list);
    }
}
