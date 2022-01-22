package PrimitiveTypes;

public class TruthTable2
{

    public static void main(String[] args) {
        // there is an event for kids
        // if the age of child is 6 or less or if the height of child is
        // 48 inches or less the event is free for that child

        int eventAge = 6;
        int eventHeight = 48;
        int kidAge = 7;
        int kidHeight = 47;
        boolean isFree = kidAge <= eventAge || kidHeight <= eventHeight;
        boolean isFree1 = eventAge <= kidAge || eventHeight <= kidHeight;

        System.out.println("Kid gets in free to event? "+isFree);
        System.out.println("Kid gets in free to event? "+isFree1);

        // find out if student can pass a class
        // there are 3 tests taken
        // average of those tests has to be 70 or more
        // attendance rate of the student has to be 80% or more

        int test1 = 90, test2 = 70, test3 = 100;
        int reqAttendance = 80;
        int reqAverage = 70;
        int studentTest = 80;
        int studentAttendance = 85;
        int average = (test1 + test2 + test3) / 3;

        boolean canPass = average >= reqAverage && studentAttendance >= reqAttendance;
        System.out.println("Can student pass? " +canPass);

        System.out.println("Did I pass the class? "+canPass);

    }
}
