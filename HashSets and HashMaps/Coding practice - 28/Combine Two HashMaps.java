import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] first_map_keys = input.nextLine().split(" ");
        String[] first_map_values = input.nextLine().split(" ");
        String[] second_map_keys = input.nextLine().split(" ");
        String[] second_map_values = input.nextLine().split(" ");
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(int i = 0 ; i < first_map_values.length ; i ++){
            map1.put(first_map_keys[i], Integer.parseInt(first_map_values[i]));
        }
        for(int i = 0 ; i < second_map_values.length ; i ++){
            map2.put(second_map_keys[i], Integer.parseInt(second_map_values[i]));
        }
        HashMap<String,Integer> combined_map = new HashMap<>();
        combined_map.putAll(map1);
        combined_map.putAll(map2);
        ArrayList<String> keys = new ArrayList<>(combined_map.keySet());
        Collections.sort(keys);
        for(String key : keys){
            System.out.printf("%s:%s\n",key,combined_map.get(key));
        }
    }
}
