public class Car {
    public final static String brand = "";
    public static String model = "";
    public final double horsepower;

    public Car() {
        this.horsepower = 34.5;
    }

    public Car(double horsepower) {
        this.horsepower = horsepower;
    }

    public static String getModel() {
        return model;
    }
    public static void setModel(String model) {
        Car.model = model;
    }
    public static void stop(){
        System.out.println("The vehicle is stopping.");
    }
     public void acelerate(){
         System.out.println("The vehicle is accelerating.");
     }
}
