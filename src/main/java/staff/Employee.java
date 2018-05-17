package staff;

public abstract class Employee {
    private String name;
    private String nNumber;
    private double salary;

    public Employee ( String name, String nNumber, double salary) {
        this.name = name;
        this.nNumber = nNumber;
        this.salary = salary;
    }

    public String name(){
        return this.name;
    }

    public String nNumber(){
        return this.nNumber;
    }

    public double salary(){
        return this.salary;
    }

    public void raiseSalary(double raise){
       this.salary += raise;
    }

    public double payBonus(){
       double bonus =  this.salary * 0.01;
       return bonus;
    }
}

