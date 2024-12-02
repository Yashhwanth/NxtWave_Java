import java.util.*;
class Main {
    public static void main(String[] args) { 
        // Write your code here
        Scanner input  = new Scanner(System.in);
        char ch = input.nextLine().charAt(0);
        switch (ch) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                System.out.println("Vowel");
                break;

                case 'B':
                case 'C':
                    case 'D':
                case 'F':
                    case 'G':
                case 'H':
                case 'J':
                case 'K':
                    case 'L':
                case 'M':
                    case 'N':
                case 'P':
                    case 'Q':
                case 'R':
                    case 'S':
                case 'T':
                    case 'V':
                case 'W':
                    case 'X':
                        case 'Y':
                            case 'Z':
                System.out.println("Consonant");
                break;
                    
            default :
            System.out.println("Not an Alphabet");
            break;
            }
    }
}
