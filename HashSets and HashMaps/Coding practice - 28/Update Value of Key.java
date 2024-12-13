import java.util.*;
class Main {
    public static void main(String[] args) { 
        
        String[] names = {"Ram","Naresh","Vani","Rahim","Deepak"};
        String[] games = {"Cricket","Football","Tennis","Cricket","Boxing"};
        // Write your code here
        HashMap<String,String> map = new HashMap<>();
        for(int i = 0 ; i < names.length ; i ++){
            map.put(names[i],games[i]);
        }Scanner input = new Scanner(System.in);
        String[] key_value = input.nextLine().split(" ");
        map.put(key_value[0],key_value[1]);
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for(String key : keys){
            System.out.printf("%s:%s\n",key,map.get(key));
        }
    }
}
