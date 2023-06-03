import java.util.Scanner;

public class self_check_11 {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("Player A Score");
        int scoreA = score.nextInt();
        System.out.println("Player B Score");
        int scoreB = score.nextInt();
        
        if (scoreA > scoreB) {
            System.out.println("Player A won");
        }
        else if (scoreA < scoreB) {
            System.out.println("Player B won");
        }
        else {
            System.out.println("Game tied");
        }
        System.out.println("Highest Score for this round = " + Math.max(scoreA, scoreB));
    }
}
