package OOP.Abstraction.AbstracClasses;

public abstract class Student {

    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    //abstract public void attend() {            RED!?!?

        abstract void watch ();

    package OOP.Abstraction.AbstractClasses;

    public abstract class Student {


        String name;
        int age;

        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        abstract  public void attend();

        abstract void watch();

        public void eat(){
            System.out.println("Student is eating");
        }

        abstract  void sleep(int hour);

    }





    }
//}             RED!?!?
