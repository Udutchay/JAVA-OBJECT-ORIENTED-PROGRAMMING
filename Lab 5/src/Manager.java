public class Manager extends SalariedEmployee{
    private double bonus;

    public Manager(String name,double basicSalary, double bonus){
        super(name, basicSalary);
        this.bonus = bonus;
    }
    @Override
    public double computeSalary(){
        return super.computeSalary() + bonus;
    }
}
