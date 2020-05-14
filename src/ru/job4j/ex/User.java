package ru.job4j.ex;

/**
 * Класс описывает User.
 * @author Kustrin Sergei.
 */
public class User {

    /**
     * Имя User.
     */
    private String userName;
    /**
     * Валидность юзера.
     */
    private boolean valid;

    public User(String userName, boolean valid) {
        this.userName = userName;
        this.valid = valid;
    }

    public String getUserName() {
        return this.userName;
    }

    public boolean isValid() {
        return this.valid;
    }
}
