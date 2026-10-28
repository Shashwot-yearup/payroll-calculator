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
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
