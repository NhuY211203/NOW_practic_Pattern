package observer;

public class Student implements Observer {
    private String studentId;
    private String name;
    private String className;

    public Student(String studentId, String name, String className) {
        this.studentId = studentId;
        this.name = name;
        this.className = className;
    }

    @Override
    public void update(String message) {
        System.out.println("Student: " + name + " in class " + className + " received message: " + message);
    }
}