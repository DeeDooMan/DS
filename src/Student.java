public class Student {
    private String name;
    private int examsNote;

    public Student(String name, int examsNote){
        this.name = name;
        this.examsNote = examsNote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExamsNote() {
        return examsNote;
    }

    public void setExamsNote(int examsNote) {
        this.examsNote = examsNote;
    }
}
