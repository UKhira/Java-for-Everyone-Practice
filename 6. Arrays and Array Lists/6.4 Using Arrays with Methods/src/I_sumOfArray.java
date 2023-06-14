public class I_sumOfArray {
    public static void total(double [] array) {
        double sum = 0;
        for (double item : array) {
            sum += item;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        double [] values = {12, 22323, 12.21, 232323, 122.2, -22122.21};
        
        total(values);
    }
}
