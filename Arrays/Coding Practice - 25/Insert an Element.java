import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = input.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 40, 50, 60));
        arrayList.add(i, n);
        System.out.println(arrayList);
    }
}
