import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int lcm = 0;
        int larger_number = m > n ? m :n;
        for(int i = larger_number ; i <= m * n ; i ++){
            if(i % m == 0 && i % n == 0){
                lcm = i;
                break;
            }
        }System.out.println(lcm);
    }
}
