package Object;

public class TestCar {

    public static void main(String[] args) {

        Car car1 = new Car("toyota");
        Car car2 = new Car("Supra");
        Car car3 = new Car("4-Runner");

        car1.move();
        car2.move("west");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        car1 = null;
        System.gc();
    }
}
