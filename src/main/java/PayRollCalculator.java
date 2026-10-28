import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PayRollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = "employees.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/" + fileName))){


        }
    }
}
