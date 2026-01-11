package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        Util.getConnection(); // проверяем соединение с БД

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();// Создаем таблицу Users

        userService.saveUser("Иван", "Иванов", (byte) 22);
        userService.saveUser("Петр", "Петров", (byte) 25);
        userService.saveUser("Семен", "Семенов", (byte) 31);
        userService.saveUser("Степан", "Степанов", (byte) 28); // добавляем 4х users

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user.getId() + ": " + user.getName() + " " + user.getLastName() + ", Age: " + user.getAge()); // Получение всех User из базы
        }
        userService.removeUserById(3);
        userService.cleanUsersTable();
        userService.dropUsersTable();
// реализуйте алгоритм здесь
    }
}
