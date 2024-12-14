import java.util.Scanner;

class Main {

    static void validateAtmPinCode(String pin) {
        // Write your code here
        if(!(pin.length() % 4 == 0 || pin.length() % 6 == 0)){
            System.out.println("Invalid PIN Code");
            return;
        }
        for(int i = 0 ; i < pin.length() ; i ++){
            char character = pin.charAt(i);
            if(!Character.isDigit(character)){
                System.out.println("Invalid PIN Code");
                return;
            }
        }System.out.println("Valid PIN Code");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pin = sc.nextLine();
        // Call the function
        validateAtmPinCode(pin);
        sc.close();
    }

}
