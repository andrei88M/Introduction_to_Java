package task._06_task.task1.view;

import task._06_task.task1.controller.Commands;

import java.util.Scanner;

public class RequestView {
    private final Scanner scanner = new Scanner(System.in);

    public String enterCommand() {
        boolean check = true;
        String enter = null;
        while (check) {
            enter = scanner.nextLine();
            check = Commands.checkCommand(enter);
        }
        return enter;
    }

    public String regOrAuth() {
        System.out.println(Commands.CLOSE.name() + "/" + Commands.AUTHENTICATION + "/" + Commands.REGISTRATION);
        while (true) {
            String enter = scanner.nextLine();
            if (enter.equalsIgnoreCase(Commands.REGISTRATION.name()) ||
                    enter.equalsIgnoreCase(Commands.AUTHENTICATION.name()) ||
                    enter.equalsIgnoreCase(Commands.CLOSE.name())) {
                return enter;
            }
        }
    }

    public String log() {
        System.out.print("login: ");
        String login = scanner.nextLine();
        return login;
    }

    public String pass() {
        System.out.print("password: ");
        String password = scanner.nextLine();
        return password;
    }

    public String mail() {
        System.out.print("mail:");
        String mail = scanner.nextLine();
        return mail;
    }


    public String seeBook_seeMail_latterMail() {
        String enter = "";
        System.out.println(Commands.CLOSE + "/" +
                Commands.SEE_CATALOG + "/" +
                Commands.SEE_MAIL + "/" +
                Commands.WRITE_LETTER + "/" +
                Commands.CREATE_EBOOK);

        while (true) {
            enter = scanner.nextLine();

            if (enter.equalsIgnoreCase(Commands.SEE_CATALOG.name())) {
                return Commands.SEE_CATALOG.name();
            } else if (enter.equalsIgnoreCase(Commands.SEE_MAIL.name())) {
                return Commands.SEE_MAIL.name();
            } else if (enter.equalsIgnoreCase(Commands.WRITE_LETTER.name())) {
                return Commands.WRITE_LETTER.name();
            } else if (enter.equalsIgnoreCase(Commands.CLOSE.name())) {
                return Commands.CLOSE.name();
            } else if (enter.equalsIgnoreCase(Commands.CREATE_EBOOK.name())){
                return Commands.CREATE_EBOOK.name();
            }
        }
    }

    public String adminCommand() {
        String enter = "";
        System.out.println(Commands.CLOSE + "/" +
                Commands.SEE_CATALOG + "/" +
                Commands.SEE_MAIL + "/" +
                Commands.WRITE_LETTER + "/" +
                Commands.WRITE_LETTER_ALL + "/" +
                Commands.ADD_EBOOK + "/" +
                Commands.ADD_PBOOK);

        while (true) {
            enter = scanner.nextLine();

            if (enter.equalsIgnoreCase(Commands.SEE_CATALOG.name())) {
                return Commands.SEE_CATALOG.name();
            } else if (enter.equalsIgnoreCase(Commands.SEE_MAIL.name())) {
                return Commands.SEE_MAIL.name();
            } else if (enter.equalsIgnoreCase(Commands.WRITE_LETTER.name())) {
                return Commands.WRITE_LETTER.name();
            } else if (enter.equalsIgnoreCase(Commands.CLOSE.name())) {
                return Commands.CLOSE.name();
            }
        }
    }


}
