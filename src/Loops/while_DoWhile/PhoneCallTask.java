package Loops.while_DoWhile;

public class PhoneCallTask {
    public static void main(String[] args) {
        /*
         -you $40 in your international phone calling account
         -if every call you make costs $5
         -find out and print: how many total calls you can make with your balance of $40
         ex. print out --> "you can make <...> calls with your balance"
         */
        int bal = 40;
        int call$ = 5;
        int count=0;
        while(bal>=call$){
            bal-= call$;
            count++;
            int calls = bal/call$;
            System.out.println(calls);
            System.out.println("You can make "+calls+" more calls with your remaining balance of " + bal);
        }
        System.out.println("you can make "+ count + " calls with your balance");
    }
}
