import java.math.BigInteger;
import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");
        BigInteger product = new BigInteger("1");
        for(String number : numbers){
            product = product.multiply(new BigInteger(number));
        }System.out.println(product);
    }
}
