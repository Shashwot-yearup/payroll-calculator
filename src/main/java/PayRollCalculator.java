import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PayRollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/employees.csv" ))){
            String line;

            System.out.printf("%-10s %-22s %12s%n",
                    "Employee ID", "Name", "Gross Pay");
            System.out.println("-----------------------------------------------");

            while ((line = reader.readLine()) != null){

                String[] pipe = line.split("\\|");// splites by the pipe

                //pares its to is appropriate data types
                int employeeId = Integer.parseInt(pipe[0]);
                String name = pipe[1];
                double hoursWorked = Double.parseDouble(pipe[2]);
                double payRate = Double.parseDouble(pipe[3]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
