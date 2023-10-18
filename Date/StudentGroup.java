package Date;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;
    private Teacher teacher;

    public StudentGroup(List<Student> studentList, Teacher teacher) {
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Date.StudentGroup{" +
                "studentList=" + studentList +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this.studentList);
    }
}
