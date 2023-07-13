public class Main {
    public static void main(String[] args) {
        // clases and objects

        Car c1 = new Car(); // create a new Car object

        // initialize the attributes of the Car object

        c1.color = "red";   // set the color of the Car object
        c1.name = "Toyota"; // set the name of the Car object
        c1.speed = 100;     // set the speed of the Car object
        c1.weight = 45.5;   // set the weight of the Car object
        c1.no = 1234;   // set the number of the Car object

        // call the methods of the Car object

        c1.speed(); // call the speed method of the Car object
        c1.color(); // call the color method of the Car object

        Car c2 = new Car(); // create a new Car object
        Car c3 = new Car(); // create a new Car object

        c2.speed(); // has not been initialized. so it is 0
        c3.color(); // has not been initialized. so it is null
    }
}
