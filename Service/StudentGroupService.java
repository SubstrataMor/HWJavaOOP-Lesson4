package Service;

import Date.Student;
import Date.StudentGroup;
import Date.Teacher;
import Date.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(students, teacher);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(students);
        return students;
    }

    public List<Student> getSortedByFIOStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudentList());
        students.sort(new UserComparator<Student>());
        return students;
    }

    public boolean removeStudent(String surname, String firstname, String patronymic) {
        Iterator<Student> iteratorStudents = studentGroup.iterator();
        while (iteratorStudents.hasNext()) {
            Student student = iteratorStudents.next();
            if (student.getSecondName().equals(surname) && student.getFirstName().equals(firstname)
                    && student.getPatronymic().equals(patronymic)) {
                iteratorStudents.remove();
                return true;
            }
        }
        return false;
    }
}
