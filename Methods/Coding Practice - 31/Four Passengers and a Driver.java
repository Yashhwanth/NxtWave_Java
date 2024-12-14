import java.util.Scanner;

class Main {

    static int numberOfCarsNeeded(int numOfPeople) {
        // Write your code here
        int capacity = 5 ;
        int no_of_cars = numOfPeople / capacity;
        if(numOfPeople % capacity > 0) no_of_cars ++;
        return no_of_cars;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(numberOfCarsNeeded(s));

        sc.close();

    }

}
