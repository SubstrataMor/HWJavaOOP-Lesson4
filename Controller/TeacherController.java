package Controller;

import Date.Teacher;
import Service.TeacherService;
import View.TeacherView;

import java.util.List;

public class TeacherController implements IUserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(teacherService.getAll());
    }
    public void editTeacher(Integer teacherId, String surname,String firstname, String patronymic){
        teacherService.editTeacher(teacherId, surname, firstname, patronymic);
    }
    public void initTeacherList(List<Teacher> list){
        teacherService.initData(list);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
}