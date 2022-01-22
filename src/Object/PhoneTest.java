package Object;

public class PhoneTest {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "I-Phone";
        phone.call(411);

        Phone phone1 = new Phone();
        Phone phone2 = new Phone("Pink");
        System.out.println(phone2.color);

        Phone phone3 = new Phone("Black", "Samsung");
        System.out.println("This is 2 argument constructor");

    }
}
