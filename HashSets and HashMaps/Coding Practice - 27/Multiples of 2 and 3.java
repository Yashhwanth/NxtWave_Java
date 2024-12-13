import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        HashSet<Integer> two_mul = new HashSet<Integer>();
        HashSet<Integer> three_mul = new HashSet<Integer>();
        
        for(int i = 1 ; i <= num  ; i++){
            two_mul.add(2 * i);
            three_mul.add(3 * i);
        }
        HashSet<Integer> common_mul = new HashSet<>(two_mul);
        common_mul.retainAll(three_mul);
        
        HashSet<Integer> two_but_not_three = new HashSet<Integer>(two_mul);
        two_but_not_three.removeAll(three_mul);
        ArrayList<Integer> list1 = new ArrayList<>(two_but_not_three);
        Collections.sort(list1);
        
        HashSet<Integer> uncommon_mul = new HashSet<Integer>();
        uncommon_mul.addAll(two_mul);
        uncommon_mul.addAll(three_mul);
        uncommon_mul.removeAll(common_mul);
        ArrayList<Integer> list2 = new ArrayList<>(uncommon_mul);
        Collections.sort(list2);
        
        System.out.println(list1);
        System.out.println(list2);

    }
}
