package Controller;

import Date.Student;
import Service.StudentService;
import View.StudentView;

public class StudentController implements IUserController<Student>{
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        studentService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(studentService.getAll());
    }
}
