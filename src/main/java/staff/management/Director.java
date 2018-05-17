package staff.management;

import staff.Employee;

public class Director extends Manager {
    private double budget;

    public Director ( String name, String nNumber, double salary, String deptName, double budget){
        super(name, nNumber, salary, deptName);
        this.budget = budget;
        }

        public double getBudget(){
            return this.budget; }
}
