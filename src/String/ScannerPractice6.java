package String;

import java.util.Scanner;

public class ScannerPractice6
{
    /*  -deposit money for David
    David wants to deposit his paychecks into his account and already has $200
	He has 3 paychecks (610, 385, 975)
	he can only deposit one check at a time
	*Ask: "How much is Deposit amount?" every time he is making deposit
	after all of paychecks deposited in to account
	he bought a phone for $599 and headphone for $299
	*Ask: How much is phone?
	*Ask: How much is headPhone?
	Calculate his final money and print --> "Your final balance is <finalAmount>"
     */
    public static void main(String[] args) {
        double bal = 200;  // his initial amount in the account

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is Deposit amount? ");
        double firstCheck = scanner.nextDouble();
        bal += firstCheck;
        System.out.println("How much is Deposit amount? ");
        double secondCheck = scanner.nextDouble();
        bal += secondCheck;
        System.out.println("How much is Deposit amount? ");
        double thirdCheck = scanner.nextDouble();
        bal += thirdCheck;

        System.out.println("How much is phone? ");
        double phone$ = scanner.nextDouble();
        bal -= phone$;

        System.out.println("How much is headPhone? ");
        double headPhone$ = scanner.nextDouble();
        bal -= headPhone$;

        System.out.println("Your Final balance is $"+bal);






    }
}
