import java.util.Scanner;

class Main {

    static void calculateLeaguePoints(int a, int b, int c) {
        // Write your code here
        int win_pts = 4;
        int draw_pts = 2;
        int loss_pts = -1;
        System.out.println(a * win_pts + b * draw_pts + c * loss_pts);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String scores = sc.nextLine();
        String[] nums = scores.split(",");
        int n = nums.length;
        int[] numb = new int[n];
        for (int i = 0; i < n; i++) {
            numb[i] = Integer.parseInt(nums[i]);
        }int wins = numb[0];
        int draws = numb[1];
        int losses = numb[2];
        calculateLeaguePoints(wins, draws, losses);
        // Call the function

        sc.close();
    }

}
