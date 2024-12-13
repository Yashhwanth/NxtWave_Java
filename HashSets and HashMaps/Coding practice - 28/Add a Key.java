import java.util.*;
class Main {
    public static void main(String[] args) { 
        String[] names = { "Ram", "Naresh", "Vani", "Rahim" };
        String[] games = { "Cricket", "Football", "Tennis", "Cricket" };
        // Write your code here
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0 ; i < names.length ; i ++){
            map.put(names[i],games[i]);
        }
        Scanner input = new Scanner(System.in);
        String[] key_value = input.nextLine().split(" ");
        map.put(key_value[0],key_value[1]);
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(String key : list){
            System.out.printf("%s:%s\n",key,map.get(key));
        }
    }
}
