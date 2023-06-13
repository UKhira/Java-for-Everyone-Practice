public class II_average_of_array {
    public static void main(String[] args) {
        double [] array = {1, 12, 342, 12213, 43, 442};
        double sum = 0;
        for (double s: array) {
            sum = sum + s;
        }
        double average = 0;
        if(array.length > 0) {//to avoid zero division
            average = sum/ array.length;
        }
        System.out.print("Average = " +  average);
    }
}
