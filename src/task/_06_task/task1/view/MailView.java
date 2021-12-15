package task._06_task.task1.view;

import task._06_task.task1.bean.User;
import task._06_task.task1.dao.DAOMail;
import task._06_task.task1.dao.DAOeBook;
import task._06_task.task1.dao.EBookDAO;
import task._06_task.task1.dao.MailDAO;

import java.io.IOException;
import java.util.Scanner;

public class MailView {
    public String seeMail(String email) throws IOException {
        DAOMail daoMail = new MailDAO();
        String mail = daoMail.get(email);
        return mail;
    }

    public boolean writeLetter() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String mail = scanner.nextLine() + ".txt";
        String text = scanner.nextLine();
        DAOeBook daOeBook = new EBookDAO();
        DAOMail daoMail = new MailDAO();
        boolean bool;
        bool = daoMail.update(mail, text);
        return bool;
    }
}
