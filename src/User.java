//Дан класс User, который содержит поля с именем и возрастом. Необходимо реализовать следующий метод:
//        1. На входе коллекция пользователей
//        2. Необходимо удалить все дубли (одинаковое имя и возраст)
//        3. Отсортировать по возрасту и имени
//        4. Вернуть самого старого пользователя

import java.util.Arrays;
import java.util.List;


public class User {
    private Object age;
    public User(String ivan, int i) {
    }

    public static User task1(List<User> users) {
        users = Arrays.asList(new User("Ivan", 15), new User("Masha", 17), new User("Kolya", 23), new User("Denis", 7), new User("Vova", 45), new User("Marina", 15), new User("Kolya", 15), new User("Vova", 25), new User("Vlad", 26), new User("Ivan", 17));

        User result = User.task1(users);
        result.equals("Vova", result.getName(), "В конце должен быть Vova, 45 лет");
        result.equals(String.valueOf(45), result.getAge(), "В конце должен быть Vova, 45 лет");
        return result;
    }

    private void equals(String vova, Object name, String s) {
    }
    private Object getName() {
        return null;
    }
    public Object getAge() {
        return age;
    }
    public void setAge(Object age) {
        this.age = age;
    }
}