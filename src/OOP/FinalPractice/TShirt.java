package OOP.FinalPractice;

public final class TShirt extends Shirt {

 //   public void wash(){   >>> you cannot override Final method!!!
 //       System.out.println("You can wash this TShirt");
 //   }
    @Override
    public boolean fit(char size){
        return true;
    }
}

