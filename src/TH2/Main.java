package TH2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","white");
        Car car2 = new Car("Audi","black");
        System.out.println("Car 1's brand is"+ car1.getBrand()); // BMW
        car1.setColor("blue");
        System.out.println(car1.toString()); // Car{brand='BMW', color='blue'}
        System.out.println(car2.toString()); // Car{brand='Audi', color='black'}
        Motorcycle motor1 = new Motorcycle("Kawasaki","green");
        Motorcycle motor2 = new Motorcycle("Ducati","red");
        System.out.println(motor1.toString()); // Motorcycle{brand='Kawasaki', color='green'}
        System.out.println(motor2.toString()); // Motorcycle{brand='Ducati', color='red'}
    }
}
