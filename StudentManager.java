import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class StudentManager {

    public static void main(String[] args) {
        // Path to the CSV file
        String fileName = "C:\\Users\\ACER\\Desktop\\ADT TEST\\class_roaster67.csv";

        Vector<Student> students = new Vector<>();

        // Read the file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) { // Ensure all necessary fields exist
                    try {
                        // Ensure that studentNumber is a valid number
                        int studentNumber = Integer.parseInt(parts[0].trim()); // This will throw an exception if not a number
                        String firstName = parts[1].trim();
                        String lastName = parts[2].trim();
                        String faculty = parts[3].trim();
                        students.add(new Student(studentNumber, firstName, lastName, faculty));
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping invalid student number in line: " + line);
                    }
                } else {
                    System.out.println("Skipping invalid line (not enough columns): " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Display sorting and searching options
        Scanner scanner = new Scanner(System.in);
        System.out.println("Options:");
        System.out.println("-n : Sort by student number");
        System.out.println("-f : Sort by first name");
        System.out.println("-l : Sort by last name");
        System.out.println("-c : Sort by faculty");
        System.out.println("-s : Search by first name");

        System.out.print("Enter an option: ");
        String option = scanner.nextLine();

        switch (option) {
            case "-n":
                students.sort(Comparator.comparingInt(s -> s.studentNumber));
                break;
            case "-f":
                students.sort(Comparator.comparing(s -> s.firstName));
                break;
            case "-l":
                students.sort(Comparator.comparing(s -> s.lastName));
                break;
            case "-c":
                students.sort(Comparator.comparing(s -> s.faculty));
                break;
            case "-s":
                System.out.print("Enter the first name to search: ");
                String searchTerm = scanner.nextLine();
                linearSearch(students, searchTerm);
                return;
            default:
                System.out.println("Invalid option. Use -n, -f, -l, -c, or -s.");
                return;
        }

        // Print sorted list
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void linearSearch(Vector<Student> students, String searchTerm) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).firstName.equalsIgnoreCase(searchTerm)) {
                System.out.println("Found at index " + i + ": " + students.get(i));
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
