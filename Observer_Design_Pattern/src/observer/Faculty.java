package observer;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<ClassRoom> classRooms;

    public Faculty(String name) {
        this.name = name;
        this.classRooms = new ArrayList<>();
    }

    public void addClassRoom(ClassRoom classRoom) {
        classRooms.add(classRoom);
    }

    public void removeClassRoom(ClassRoom classRoom) {
        classRooms.remove(classRoom);
    }

    public List<ClassRoom> getClassRooms() {
        return classRooms;
    }
}