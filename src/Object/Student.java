package Object;

import java.util.Random;

public class Student {
    String name;
    int age= 23;  // 3 ways to initialize a variable
    int id;
    public void setId(int number){     // 3 ways to initialize a variable
        id = number;
    }
    public void study(){

        System.out.println(name + " is studying " + createHour()+ " hours");
    }
    public void sleep(){
        System.out.println(name +" is sleeping "+ createHour()+ " hours");
    }
    public void reading(){
        System.out.println(name+ " is reading " + createHour() + " hours");
    }

    public static int createHour() {
        Random random = new Random();
        return random.nextInt(12);
    }

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "David";          // 3 ways to initialize a variable
        std1.study();
        std1.study();
        System.out.println(createHour());
    }
}
