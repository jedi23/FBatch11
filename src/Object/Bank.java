package Object;

public class Bank {

    /*
    -accountHolderName, balance, accountNumber, userName, password, isLoggedIn
-create a method that will display all account information
-create a method that will be named as deposit(), and it will update balance
-create a method that will be named as withdraw(), and it will update balance
-create a method that will be named as logIn(),
                        and will check if the user logged in or not and returns true/false
     */

    String accountHolderName;
    double balance;
    int accountNumber;
    String userName;
    String passWord;
    boolean isLoggedIn;

    public Bank(String accountHolderName, double balance, String userName, String passWord) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.userName = userName;
        this.passWord = passWord;
        this.accountNumber = Student.createHour();
    }

    public void printInfo(){
        if (isLoggedIn == true) {
            System.out.println(accountHolderName + " " +
                    balance + " " + accountNumber + " " +
                    userName + " " + passWord + " " + isLoggedIn);
        }else {
            System.out.println("You should log in first to see your info-->" + isLoggedIn);
        }
    }
    public double deposit(double depositAmount){
        return balance +=depositAmount;

    }
    public double withdraw(double withdrawAmount){
        return  balance -= withdrawAmount;
    }
    public boolean login(String userName, String passWord){

        if (userName.equals(userName) && passWord.equals(passWord)){
            isLoggedIn = true;

            System.out.println("You logged in successfully");
        }else{
            System.out.println("Username or Password is not matching");
        }
        return isLoggedIn;
    }

    public static void main(String[] args) {
        Bank c1 = new Bank("Zack",200,"zack123","123");
        c1.login("zack123","123");

        c1.printInfo();
    }

}
