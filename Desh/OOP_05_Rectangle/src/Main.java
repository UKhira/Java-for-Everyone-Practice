public class Main {
    public static void main(String[] args) {
        Triangle r1 = new Triangle(); // this object will call the default constructor
        System.out.println("Count: " + r1.count); // count is a static variable, so it is shared by all objects
        System.out.println("Count: " + Triangle.count);
        Triangle r2 = new Triangle(10, 5); // this object will call the parameterized constructor
        // System.out.println("Count: " + r2.count);
        System.out.println("Count: " + Triangle.count);
        Triangle r3 = new Triangle(15, 7); // this object will call the parameterized constructor
        // System.out.println("Count: " + r3.count);  
        System.out.println("Count: " + Triangle.count);

        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());
       
    
        System.out.println("Area of r2: " + r2.getArea());
        System.out.println("Perimeter of r2: " + r2.getPerimeter());
    

        System.out.println("Area of r3: " + r3.getArea());
        System.out.println("Perimeter of r3: " + r3.getPerimeter());
       

        r1.length = 15; // changing the value of length
        r1.width = 7;   // changing the value of width
        System.out.println("Area of r1 after reinitialization: " + r1.getArea());
        System.out.println("Perimeter of r1 after reinitialization: " + r1.getPerimeter());
    }
}
