public class Rectangle {
    // instance variables

    double length;
    double width;
    static int count = 0;       // instaance variable -> class variable
    // if count was initialized like "int count = 0;" every time a new object is created, count would be initialized to 0
    // but
    // if count was initialized as static, it would be shared by all objects

    public Rectangle(){ // default constructor
        // these values will be assigned to the instance variables

        this.length = 5;
        this.width = 3;
        count++;
    }

    public Rectangle(double length, double width){  // parameterized constructor
        this.length = length;
        this.width = width;
        count++;
    }

    public double getArea(){    // to calculate the area of the rectangle
        return length * width;
    }

    public double getPerimeter(){   // to calculate the perimeter of the rectangle
        return 2 * (length + width);
    }

}
