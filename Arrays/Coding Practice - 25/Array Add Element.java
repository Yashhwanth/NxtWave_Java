import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Integer[] arr = {2,4,6,8,10,12};
        int num = input.nextInt();
        ArrayList<Integer> arrl = new ArrayList<>(Arrays.asList(arr));
        arrl.add(num);
        System.out.println(arrl);
    }
}
