package OOP.Abstraction.AbstracClasses;

public class OnlineStudent extends Student {

    public void attend(){
        System.out.println("Online Student is attending via Zoom");
    }
    public void watch(){
        System.out.println("Online Student is watching Java");
    }
    public OnlineStudent(){
        super("Mary",25);
    }
}
