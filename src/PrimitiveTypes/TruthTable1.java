package PrimitiveTypes;

public class TruthTable1
{

    public static void main(String[] args) {
        // visa and ticket

        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;

        boolean canTravel = visa == myVisa && ticket == myTicket;
        System.out.println(canTravel);

        // ask question

        boolean online = true;
        boolean campus = true;

        boolean student = true;

        boolean askQuestion = online || student == campus;

        System.out.println("Can I ask Question? " + askQuestion);

        // 90% or more attendance and score of 80 or more to pass this class

        int reqAttendance = 90;
        int reqScore = 80;

        int myAttendance = 100;
        int myScore = 90;

        boolean pass = myAttendance >= reqAttendance && myScore >= reqScore;
        System.out.println("Can I pass the course? " +pass);










    }

}
