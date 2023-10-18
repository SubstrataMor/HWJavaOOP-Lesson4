package View;

import Date.User;

import java.util.List;

public interface IUserView<T extends User> {
    void sendOnConsole(List<T> list);
}
