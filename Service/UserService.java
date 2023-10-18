package Service;

import java.util.List;

public interface UserService<T> {
    List<T> getAll();
    void initData(List<T> list);
    void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
