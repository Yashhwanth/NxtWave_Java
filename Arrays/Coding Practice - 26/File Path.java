import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String full_path = input.nextLine();
        String[] path = full_path.split(" ");
        String platform = path[path.length - 1];
        String[] arr = Arrays.copyOfRange(path, 0, path.length - 1);
        String delimiter = platform.equals("WIN") ? ">" : "/";
        String joined = String.join(delimiter,arr);
        System.out.println(joined);
    }
}
