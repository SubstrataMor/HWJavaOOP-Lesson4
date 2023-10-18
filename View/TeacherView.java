package View;

import Date.Teacher;

import java.util.List;

public class TeacherView implements IUserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher.toString());
        }
    }
}
