import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] list = input.nextLine().split(" ");
        HashSet<Integer> hset = new HashSet<>();
        for(String number : list){
            hset.add(Integer.parseInt(number));
        }
        ArrayList<Integer> list1 = new ArrayList<>(hset);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
