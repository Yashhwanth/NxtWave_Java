// Import the required Classes here
import java.util.*;
class Main {
    public static void main(String[] args) {
        Integer[] arrayItems = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        HashSet<Integer> setItems = new HashSet<Integer>();
        setItems.addAll(Arrays.asList(arrayItems));
        HashSet<Integer> inputItems = new HashSet<Integer>();
        Scanner input = new Scanner(System.in);
        String[] list = input.nextLine().split(" ");
        for(String number : list){
            inputItems.add(Integer.parseInt(number));
        }
        setItems.removeAll(inputItems);
        ArrayList<Integer> list1 = new ArrayList<>(setItems);
        Collections.sort(list1);
        System.out.println(list1);
        // Write your code here
    }
}
