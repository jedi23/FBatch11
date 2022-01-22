package PrimitiveTypes;

public class ComparisonPractice2
{
    public static void main(String[] args) {

        // there is an event for kids if a child's height is 48" or more
        // they can attend this event
        // print out the result if kid can attend or not

        double reqHeight = 48;
        double kidHeight = 48;
        boolean canAttend = kidHeight >= reqHeight;

        System.out.println("Can kid attend event? "+canAttend);

        // if age of child is 6 years or less will be free

        int reqAge = 6;
        int kidAge = 7;

        boolean isFree = kidAge <= reqAge;
        System.out.println("Is the event free for this kid? "+isFree);
    }

}
