import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] split = str.split(" ");
        int i = 0;
        int j = split.length - 1;
        while(i < j){
            String temp = split[i];
            split[i] = split[j];
            split[j] = temp;
            i ++;
            j --;
        }
       String joined = String.join(" ",split);
       System.out.println(joined);
       }
    }
