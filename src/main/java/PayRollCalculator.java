import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.PrintWriter;

public class PayRollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file to process");
        String inputFile = scanner.nextLine();

        System.out.println("Enter the name of the payroll file to create:");
        String newFile = scanner.nextLine();


        //try catch block.
        try (BufferedReader reader = new BufferedReader(
                new FileReader("src/main/resources/" + inputFile));
             PrintWriter writer = new PrintWriter(
                     "src/main/resources/" + newFile)) {

            String line;

            writer.println("id|name|gross pay");

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
                writer.printf("%d|%s|%.2f%n",
                        newEmployee.getEmployeeId(),
                        newEmployee.getName(),
                        newEmployee.getGrossPay());
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
