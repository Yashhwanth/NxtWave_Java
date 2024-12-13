import java.util.*;
class Main {
    public static void main(String[] args) { 
        String[] names = {"Ram","Naresh","Vani","Rahim","Deepak"};
        String[] games = {"Cricket","Football","Tennis","Cricket","Boxing"};
        HashMap<String,String> map = new HashMap<>();
        for(int i = 0 ; i < names.length ; i ++){
            map.put(names[i],games[i]);
        }
        Scanner input = new Scanner(System.in);
        String key = input.nextLine();
        map.remove(key);
        ArrayList<String> keys_set = new ArrayList<>(map.keySet());
        Collections.sort(keys_set);
        for(String str : keys_set){
            System.out.printf("%s:%s\n",str,map.get(str));
        }
    }
}
