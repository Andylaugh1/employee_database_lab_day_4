package staff;

public abstract class Employee {
    private String name;
    private String nNumber;
    private int salary;

    public Employee ( String name, String nNumber, int salary) {
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

    public int salary(){
        return this.salary;
    }
}

