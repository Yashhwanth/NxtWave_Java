import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] names = input.nextLine().split(",");
        String[] ids = input.nextLine().split(",");
        HashMap<String,String> map = new HashMap<>();
        for(int i= 0 ; i < names.length ; i ++){
            map.put(names[i],ids[i]);
        }
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for(String key : keys){
            System.out.printf("%s:%s\n",key,map.get(key));
        }
    }
}
