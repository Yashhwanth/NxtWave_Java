import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i ++){
            for(int j = 1 ; j <= i ; j ++){
                if(i == 1) System.out.print(j);
                else if(i == n) System.out.print(j + " ");
                else{
                    if(j == 1 || j == i) System.out.print(j + " ");
                    else System.out.print("  ");
                }
            }System.out.println();
        }
    }
}
