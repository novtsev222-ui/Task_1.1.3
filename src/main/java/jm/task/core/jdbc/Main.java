package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable(); // Создание таблицы пользователей

        userService.saveUser("Иван", "Иванов", (byte) 22);
        userService.saveUser("Петр", "Петров", (byte) 25);
        userService.saveUser("Семен", "Семенов", (byte) 31);
        userService.saveUser("Степан", "Степанов", (byte) 28); // добавляем 4х пользователей

        System.out.println("Список всех пользователей:");
        for (User user : userService.getAllUsers()) {
            System.out.println(user); // выводим всех пользователей на консоль
        }

        userService.removeUserById(3);// Удаление User из таблицы (по id)
        userService.cleanUsersTable(); // очищаем таблицу
        userService.dropUsersTable();// удаляем таблицу
    }
}

