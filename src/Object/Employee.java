package Object;

public class Employee {
    /*
    `method: to update company budget
    `instance fields: --> id, name, budgetOfCompany, companyName
    `constructors: --> no args, one arg, multiple
     */

    int id;
    String name;
    double budgetOfCompany;
    String companyName;

    public void updateCompanyBudget(double expenses){
        budgetOfCompany -= expenses;
        System.out.println("The budget of the company is now "+ budgetOfCompany);
    }

    public Employee(){

    }
    public Employee(int id){

    }
    public Employee(String name, int id){

    }
    public Employee(String name){
        this.name=name;
        System.out.println(name);
    }
    public Employee(String name, String companyName){

    }

    public Employee(double budgetOfCompany) {
        this.budgetOfCompany = budgetOfCompany;
    }

    public void setBudgetOfCompany(double budgetOfCompany) {
        this.budgetOfCompany = budgetOfCompany;
    }

    public double getBudgetOfCompany() {
        return budgetOfCompany;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Zack",34);
        e1.updateCompanyBudget(5000);
        e1.budgetOfCompany = 2000000000;
        //System.out.println(getBudgetOfCompany());
        System.out.println();

        // if you want to create an object with no argument constructor??
        // if there is no 'no argument' constructor in the class
        // you can create an object by using 'default' java constructor.
        // Because it will be gone after you create your own constructor
         Employee e3 = new Employee("Jack");
    }


}
