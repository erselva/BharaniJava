package functions;

class Car {

    int wheels; //class variables
    String color; //class variables

    Car() { //Constructor
        wheels = 4;
        color = "Red";
    }

    public void start(int x) { //overloaded start methods - same method name but with different parameters
        System.out.println("Start the car in x minutes");
    }

    public void start() { //overloaded start methods

        //step 1 to 100;

        System.out.println("Started the car");
    }

    public void stop() {

        System.out.println("Stopped the car");
    }

    public void changewheels(int x) {
        this.wheels = x;
    }


    public static void main(String[] orgs) {

        Car carObject = new Car(); //creating a car object - instantiation

        System.out.println("My wheels=" + carObject.wheels);
        System.out.println("My color=" + carObject.color);

        carObject.start();
        carObject.stop();

        carObject.changewheels(8);
    }
}