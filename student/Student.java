package xofever.feifei.student;

public class Student {
    private String name;
    private String ID;

    public Student() {
    }

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
