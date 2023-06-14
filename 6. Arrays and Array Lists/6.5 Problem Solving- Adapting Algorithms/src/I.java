public class I {
    /*
     * You are given the quiz scores of a student. You are to compute the final quiz score, which is the sum of 
     * all scores after dropping the lowest one.
     */
    public static void main(String[] args) {
        int [] scores = {8, 9 , 12, 92, 2, 98, 74};
        findLowest(scores);
    }

    /*
     * find the lowest mark in scores
     * @param scorelist, array containing scores
     */
    public static void findLowest(int [] scoreList) {
        int low = scoreList[0];
        for (int element : scoreList){
            if(element < low) {
                low = element;
            }
        }
        // System.out.println(low);
        dropTheLowest(scoreList,low);
    }

    /*
     * drop the lowest mark and calculate the total
     * @param initialList, list containing score and lowMark, lowest mark in list
     */
    public static void dropTheLowest(int [] initialList, int lowMark) {
        int sum = 0;
        for (int i = 0; i < initialList.length; i++){
            sum += initialList[i];
        }
        sum -= lowMark;
        System.out.println(sum);
    }
}
