package main;

import observer.ClassRoom;
import observer.Faculty;
import observer.Student;

public class Main {
    public static void main(String[] args) {
        Faculty faculty = new Faculty("Science Faculty");

        ClassRoom classRoomA = new ClassRoom("Class A");
        Student student1 = new Student("S001", "Nguyen Thi Nhu Y", "DHKTPM17B");
        Student student2 = new Student("S002", "Nguyen Van A", "DHKTPM17B");

        classRoomA.attach(student1);
        classRoomA.attach(student2);

        faculty.addClassRoom(classRoomA);

        classRoomA.setMessage("Tomorrow is a holiday!");
    }
}