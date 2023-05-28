public class V_selfCheckSoFarLearnt {
    public static void main(String[] args) {
        double percent = 8.7;
        double balance = 567.23;

        double interest = Math.round(balance * (percent / 100));
        System.out.println("Interest in first year = " + interest);

        double length = 15.6;
        double area = Math.pow(length, 2);
        System.out.println("Area of square = " + area);

        final double PI = 3.14;
        double radius = 23.4;

        double area51 = (4 / 3) * PI * (Math.pow(radius, 3));
        System.out.println("Area pf sphere = " + area51);

        System.out.println(1729 / 10);
        System.out.println(1729 % 10);

        int score1 = 10;
        int score2 = 4;
        int score3 = 9;

        double average = (score1 + score2 + score3) / 3;
        System.out.println("Average = " + average + "\n This is not the expected result this error will occur due to java's int/int method returns an integer value"); 

        double average2 = (double) (score1 + score2 + score3) / 3;
        System.out.println("This will return the expected output :\n Average = " + average2);
    }
}
