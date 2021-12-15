package task._06_task.task1.dao;

import task._06_task.task1.bean.User;

import java.io.*;

public class UserDAO implements DAOUser {
    private final File fileUser = new File("src" + separator + "task" + separator + "_06_task" +
            separator + "task1" + separator + "file" + separator + "user" + separator + "newFile.txt");

    @Override
    public boolean save(User user) throws IOException {
        File file = new File(fileUser.getParent() + separator + user.getLogin() + ".txt");
        if (file.exists()) {
            return false;
        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(user);
        }
        return true;
    }

    @Override
    public User get(String login) throws IOException, ClassNotFoundException {
        User user = null;
        File file = new File(fileUser.getParent() + separator + login + ".txt");
        if (!file.exists()) {
            return null;
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            user = (User) inputStream.readObject();
        }
        return user;
    }

    @Override
    public boolean update(User user) throws IOException {
        File file = new File(fileUser.getParent() + separator + user.getLogin() + ".txt");
        if (!file.exists()) {
            return false;
        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(user);
        }
        return true;
    }

    @Override
    public boolean remove(User user) {
        File file = new File(fileUser.getParent() + separator + user.getLogin() + ".txt");
        return file.delete();
    }
}
