import java.util.Scanner;

class Main {
    
    static void Indexing(String word, int index) {
        // Write your code here
        System.out.println(word.charAt(index));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int index = sc.nextInt();
        // Call the function
        Indexing(word, index);
        sc.close();
    }

}
