package task._06_task.task1.controller;

import task._06_task.task1.controller.command_access.CommAuth;
import task._06_task.task1.controller.command_access.CommReg;
import task._06_task.task1.controller.command_admin.CommAddEBook;
import task._06_task.task1.controller.command_admin.CommAddPaperBook;
import task._06_task.task1.controller.command_admin.CommWriteLetterAll;
import task._06_task.task1.controller.command_scanner.*;
import task._06_task.task1.controller.command_user.CommCreateEBook;
import task._06_task.task1.controller.command_user.CommSeeCatalog;
import task._06_task.task1.controller.command_user.CommSeeMail;
import task._06_task.task1.controller.command_user.CommWriteLetter;

import java.util.HashMap;
import java.util.Map;

public class CommandAllImpl implements CommandAll {
    private Map<String, Command> commandMap;

    {
        commandMap = new HashMap<>();
        commandMap.put ( Commands.REG_AUTH.name(),             new CommRegAuth());
        commandMap.put ( Commands.REGISTRATION.name(),         new CommLogPassMail());
        commandMap.put ( Commands.LOGIN_PASSWORD_MAIL.name(),  new CommReg());
        commandMap.put ( Commands.AUTHENTICATION.name() ,      new CommLogPass());
        commandMap.put ( Commands.LOGIN_PASSWORD.name(),       new CommAuth());
        commandMap.put ( Commands.USER.name(),                 new CommUser());
        commandMap.put ( Commands.SEE_CATALOG.name(),          new CommSeeCatalog());
        commandMap.put ( Commands.SEE_MAIL.name(),             new CommSeeMail());
        commandMap.put ( Commands.CREATE_EBOOK.name(),         new CommCreateEBook());
        commandMap.put ( Commands.WRITE_LETTER.name(),         new CommWriteLetter());
        commandMap.put ( Commands.ADMIN.name(),                new CommAdmin());
        commandMap.put ( Commands.WRITE_LETTER_ALL.name(),     new CommWriteLetterAll());
        commandMap.put ( Commands.ADD_EBOOK.name(),            new CommAddEBook());
        commandMap.put ( Commands.ADD_PBOOK.name(),            new CommAddPaperBook());
    }

    @Override
    public Command execute(String request) {

        return commandMap.get(request);
    }
}
