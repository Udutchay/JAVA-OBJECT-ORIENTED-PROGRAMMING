//POSTLAB CHALLENGE
public class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public double computeSalary(){
        return basicSalary;
    }
    @Override
    public String toString(){
        return name + "Basic Salary: "+ basicSalary;
    }
}
