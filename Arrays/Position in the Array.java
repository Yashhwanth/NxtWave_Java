import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int index = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            arr.add(i,input.nextInt());
        }
        for(int i = 0 ; i < n ; i++){
            if(k < arr.get(i)){
                index = i;
                arr.add(i,k);
                break;
            }else if(k == arr.get(i)) break;
        }System.out.println(index);
        System.out.println(arr);
    }
}
