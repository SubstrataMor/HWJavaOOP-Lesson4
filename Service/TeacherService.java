package Service;

import Date.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private List<Teacher> teachers;
    private Long maxTeacherId = 0L;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    private Long getNewMaxTeacherId(){
        Long result = teachers.get(0).getTeacherId();
        for (Teacher teacher: teachers) {
            if (result < teacher.getTeacherId()){
                result = teacher.getTeacherId();
            }
        }
        return result;
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void initData(List<Teacher> list) {
        this.teachers = list;
        maxTeacherId = getNewMaxTeacherId();
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        for (Teacher teacher: teachers){
            if (teacher.getTeacherId() > maxTeacherId){
                maxTeacherId = teacher.getTeacherId();
            }
        }
        maxTeacherId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, maxTeacherId);
        teachers.add(teacher);
    }
    public void editTeacher(Integer teacherId, String surname,String firstname, String patronymic){
        for (Teacher teacher: teachers) {
            if (teacher.getTeacherId().equals(teacherId)){
                teacher.setSecondName(surname);
                teacher.setFirstName(firstname);
                teacher.setPatronymic(patronymic);
            }
        }
    }
}