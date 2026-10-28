public class Employee {
    private int employeeId;
    private String name;
    private  double hoursWorked;
    private int payRate;

    //constructor
    public Employee(int employeeId, String name, double hoursWorked, int payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    //getter and setters.
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }


    //does the math for the grosspay
    public double GetGrossPay(){
        return hoursWorked * payRate;
    }
}