package Object;

public class Phone {

    String brand;
    double price = 1000;
    String color;
     // this is a constructor
    // public Phone(){
       // System.out.println("This is NO argument constructor");
    //}

    // constructor
    public Phone(){
        this("Navy Blue", "Google");
        System.out.println("This is no argument constructor");
    }

    public Phone(String newColor){
        this.color = newColor;
        System.out.println("This is ONE argument constructor");
    }
    public Phone(String newColor, String newBrand){
        this.color = newColor;
        this.brand = newBrand;

    }

    // method to set color
    public void setColor(String color1){
        color = color1;
    }
    // method to call
    public void call(int number){
        System.out.println(number+" is being called");
    }
}
