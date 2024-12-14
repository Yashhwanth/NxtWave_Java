import java.util.Scanner;

class Main {

    static String message(String name, int age) {
        // Write your code here
        return name + " is " + age + " years old.";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        // Call the function
        System.out.println(message(name, age));
        sc.close();
    }
}
