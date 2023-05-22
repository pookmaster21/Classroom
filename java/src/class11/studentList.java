package class11;

public class studentList {
    private Student[] Class;

    public studentList() {
        this.Class = new Student[30];
    }

    public Student[] getStudentList() {
        return this.Class;
    }

    public Student getStudent(String name) {
        for(Student student : this.Class) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public void add(Student st) {
        for (int i=0;i<this.Class.length;i++) {
            if (Class[i] == null) {
                Class[i] = st;
                return;
            }
            if (Class[i].equals(st)) {
                //throw ;
            }
        }
    }
}

