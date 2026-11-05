public class HourlyEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name,int hoursWorked, double hourlyRate){
        super(name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double computeSalary(){
        return hoursWorked * hourlyRate ;
    }
}
