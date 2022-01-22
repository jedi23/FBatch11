package OOP.Inheritance;

public class WildAnimal extends Animal{

    public void hunting(){
        System.out.println("Wild animal is hunting");
    }
    @Override
    public Animal run(){
        super.run();
        // System.out.println(name+" is running");
        return new WildAnimal();
    }

}
