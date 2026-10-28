import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PayRollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file to process");




        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/employees.csv" ))){
            String line;


            while ((line = reader.readLine()) != null) {

                String[] pipe = line.split("\\|");// splites by the pipe

                //pares its to is appropriate data types
                int employeeId = Integer.parseInt(pipe[0]);
                String name = pipe[1];
                double hoursWorked = Double.parseDouble(pipe[2]);
                double payRate = Double.parseDouble(pipe[3]);


                //create an employee object
                Employee newEmployee = new Employee(employeeId, name, hoursWorked, payRate);

                //sout using the formatted string
                System.out.printf("%-5d %-18s $%5.2f%n",
                        newEmployee.getEmployeeId(),
                        newEmployee.getName(),
                        newEmployee.getGrossPay());
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
