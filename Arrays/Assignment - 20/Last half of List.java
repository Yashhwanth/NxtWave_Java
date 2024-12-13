import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i ++){
            list.add(input.nextInt());
        }
        ArrayList<Integer> half = new ArrayList<>(list.subList((list.size() +1) / 2, list.size()));
    
        System.out.println(half);
    }
}
