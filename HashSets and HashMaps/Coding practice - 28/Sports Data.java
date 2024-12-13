import java.util.*;
class Main {
    public static void main(String[] args) { 
        String[] names = {"Ram","Naresh","Vani","Rahim"};
        String[] games = {"Cricket","Football","Tennis","Cricket"};
        HashMap<String,String> map = new HashMap<>();
        for(int  i = 0 ; i < names.length ; i ++){
            map.put(names[i],games[i]);
        }
        Scanner input = new Scanner(System.in);
        int no_of_entries = input.nextInt();
        input.nextLine();
        for(int i = 0 ; i < no_of_entries ; i ++){
            String[] new_entry = input.nextLine().split(" ");
            map.put(new_entry[0],new_entry[1]);
        }
        ArrayList<String> key_set = new ArrayList<>(map.keySet());
        Collections.sort(key_set);
        for(String key : key_set){
            System.out.printf("%s:%s\n",key,map.get(key));
        }
    }
}
