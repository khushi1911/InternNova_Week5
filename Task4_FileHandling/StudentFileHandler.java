import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFileHandler {
public static void main(String[] args) {
String fileName = "students.txt";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
        writer.write("Student ID: 101");
        writer.newLine();
        writer.write("Student Name: Khushi");
        writer.newLine();
        writer.write("Course: Computer Science");
        writer.newLine();
        writer.write("Marks: 92");
        writer.newLine();

        System.out.println("Student information written successfully.");

    } catch (IOException e) {
        System.out.println("Error writing to file: " + e.getMessage());
        return;
    }

    System.out.println("\nReading student information from file:");

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }
}
}
