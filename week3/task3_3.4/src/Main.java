import java.io.*;

public class Main {
    private final static String FILENAME = "enrollments.ser";

    public static void main(String[] args) {
        // Create instances of Student, Course, and Enrollment
        Student student = new Student(1, "Trang Vu", 28);
        Course course = new Course("JV101", "Java Object Oriented Programming", "Dr. Jarkko");
        Enrollment enrollment = new Enrollment(student, course, "2023-11-23");

        // Serialize and save the Enrollment instance
        serializeEnrollment(enrollment);

        // Deserialize and print the Enrollment instance
        Enrollment deserializedEnrollment = deserializeEnrollment();
        System.out.println("Deserialized Enrollment: " + deserializedEnrollment);
    }

    private static void serializeEnrollment(Enrollment enrollment) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            outputStream.writeObject(enrollment);
            System.out.println("Enrollment serialized and saved to " + FILENAME);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }
    }

    private static Enrollment deserializeEnrollment() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILENAME))) {
            Enrollment enrollment = (Enrollment) inputStream.readObject();
            System.out.println("Enrollment deserialized from " + FILENAME);
            return enrollment;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
            return null;
        }
    }
}
