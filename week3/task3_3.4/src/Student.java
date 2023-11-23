import java.io.*;

class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    // Constructors, getters, setters
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + '}';
    }
}

class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    // Constructors, getters, setters
    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return "Course{courseCode='" + courseCode + "', courseName='" + courseName + "', instructor='" + instructor + "'}";
    }
}

class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    // Constructors, getters, setters
    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    @Override
    public String toString() {
        return "Enrollment{student=" + student + ", course=" + course + ", enrollmentDate='" + enrollmentDate + "'}";
    }
}

