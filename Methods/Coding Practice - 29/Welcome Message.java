import java.util.Scanner;
class Main {

    static String message(String name)
    {
        // Write your code here
        return "Welcome " + name;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        // Call the function
        String welcome = message(name);
        System.out.println(welcome);
        sc.close();
    }
    
}
