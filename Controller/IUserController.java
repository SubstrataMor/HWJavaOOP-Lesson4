package Controller;

import Date.User;

public interface IUserController<T extends User> {
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
