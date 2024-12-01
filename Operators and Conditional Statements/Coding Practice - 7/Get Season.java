import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int season = input.nextInt();
        if(season == 11 || season == 12 || season == 1) System.out.println("Winter");
        else if(season == 2 || season == 3 ) System.out.println("Spring");
        else if(season == 4 || season == 5 || season == 6) System.out.println("Summer");
        else if(season == 7 || season == 8 ) System.out.println("Rainy");
        else if(season == 9 || season == 10 || season == 1) System.out.println("Autumn");
    }
}
