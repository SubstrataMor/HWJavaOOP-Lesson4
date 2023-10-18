package View;

import Date.Student;
import Date.StudentGroup;
import Date.User;

import java.util.List;
import java.util.logging.Logger;

public class UserView {
    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendConsole(List<User> userList){
        for (User user: userList) {
            logger.info(user.toString());
        }
    }
    public void sendConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }
    public void sendConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }
}
