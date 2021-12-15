package task._06_task.task1.controller;

public enum Commands {
    REGISTRATION,
    AUTHENTICATION,
    USER,
    ADMIN,
    SEE_CATALOG,
    SEE_MAIL,
    WRITE_LETTER,
    ADD_EBOOK,
    ADD_PBOOK,
    CREATE_EBOOK,
    WRITE_LETTER_ALL,
    LOGIN_PASSWORD,
    LOGIN_PASSWORD_MAIL,
    REG_AUTH,
    CLOSE;

    private static final Commands[] VALUES = Commands.values();

    public static boolean checkCommand(String request) {
        for (Commands value : VALUES) {
            if (value.name().equalsIgnoreCase(request)) {
                return true;
            }
        }
        return false;
    }

}
