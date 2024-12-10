import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int i = 0, j = 0;
        while(!(str.charAt(j) == ' ')){
            j ++;
        }
        String str1 = str.substring(i,j).toUpperCase();
        String str2 = str.substring(j + 1);
        System.out.println(str1 + " " + str2);
    }
}
