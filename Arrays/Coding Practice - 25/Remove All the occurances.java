import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Integer[] arr = {5, 10, 20, 35, 5, 50, 20, 100, 200, 10, 150, 100, 100};
        Integer number = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int count = Collections.frequency(list, number);
        for(int i = 0 ; i < count ; i ++){
            list.remove(number);
            continue;
        }System.out.println(list);
    }
}
