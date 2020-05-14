package ru.job4j.ex;

/**
 * Хранилище юзеров.
 * @author Kustrin Sergei.
 */
public class UserStore {

    /**
     * Ищет юзера с данным логином в хранилище.
     * @param users - массив юзеров в хранилище.
     * @param login - логин для поиска юзера.
     * @return - возвращает найденного юзера.
     * @throws UserNotFoundException
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {

        User user = null;
        for (User person : users) {
            if (person.getUserName().equals(login)) {
                user = person;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("Такого логина не существует!");
        }
        return user;
    }

    /**
     * Проверяет юзера на валидность и чтобы количество символов в логине было больше 3.
     * @param user - user.
     * @return - true если user соответствует всем условиям.
     * @throws UserInvalidException
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUserName().length() < 3) {
            throw new UserInvalidException("Юзер не валиден или логин меньше 3 символов!");
        }
        return true;
    }

    /**
     * Метод main.
     * @param args - args.
     */
    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException invalidEx) {
            invalidEx.printStackTrace();
        } catch (UserNotFoundException foundEx) {
            foundEx.printStackTrace();
        }
    }
}
