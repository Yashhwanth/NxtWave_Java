import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        HashMap<Integer,Integer> squares_map = new HashMap<>();
        for(int i = 1 ; i <= range ; i ++){
            squares_map.put(i, i * i);
        }for(int i = 1 ; i <= squares_map.size() ; i ++){
            System.out.printf("%s: %s\n",i,squares_map.get(i));
        }
    }
}
