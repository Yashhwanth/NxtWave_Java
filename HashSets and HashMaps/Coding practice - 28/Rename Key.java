import java.util.*;
class Main {
    public static void main(String[] args) { 
        String[] fruits = { "apples", "bananas", "mangoes", "oranges", "watermelons" };
        Integer[] quantities = { 10, 20, 15, 200, 50 };
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < fruits.length ; i ++){
            map.put(fruits[i], quantities[i]);
        }
        Scanner input = new Scanner(System.in);
        String old_key = input.nextLine();
        String new_key = input.nextLine();
        Integer old_key_quantity = map.get(old_key);
        map.remove(old_key);
        map.put(new_key,old_key_quantity);
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for(String key : keys){
            System.out.printf("%s %s\n",key,map.get(key));
        }
    }
}
