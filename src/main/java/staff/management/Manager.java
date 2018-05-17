package staff.management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager ( String name, String nNumber, double salary, String deptName){
        super(name, nNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
