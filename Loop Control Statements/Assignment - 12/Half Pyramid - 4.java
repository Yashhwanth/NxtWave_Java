import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int count = (k * (k + 1)) / 2;
        count = count + (n - 1);
        for(int i = 0 ; i < k ; i ++){
            for(int j = 0 ; j <= i ; j ++){
                System.out.print(count + " ");
                count -- ;
            }System.out.println();
        }
    }
}
