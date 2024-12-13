import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HashSet<Integer> hset1 = new HashSet<Integer>();
        HashSet<Integer> hset2 = new HashSet<Integer>();
        String[] list1 = input.nextLine().split(",");
        String[] list2 = input.nextLine().split(",");
        for(String number : list1){
            hset1.add(Integer.parseInt(number));
        }
        for(String number : list2){
            hset2.add(Integer.parseInt(number));
        }
        hset1.retainAll(hset2);
        ArrayList<Integer> list = new ArrayList<>(hset1);
        Collections.sort(list);
        System.out.println(list);
    }
}
