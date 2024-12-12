import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] array = {1, 6, 32, 93, 71, -20, 30, -90, 50};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0 ; i < array.length ; i ++){
            if(array[i] > number){
                arrayList.add(array[i]);
            }
        }System.out.println(arrayList);
    }
}
