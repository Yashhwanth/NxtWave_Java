import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = n ; i > 0 ; i --){
            for(int  j = 1 ; j <= i ; j ++){
                if(i == n) System.out.print("* ");
                else if(i == 1) System.out.print("* ");
                else{
                    if(j == 1 || j == i) System.out.print("* ");
                    else System.out.print("  ");
                }
            }System.out.println();
        }
    }
}
