package task._06_task.task1.dao;

import java.io.*;

public class MailDAO implements DAOMail {
    private final String string = "src" + separator + "task" + separator + "_06_task" +
            separator + "task1" + separator + "file" + separator + "mail" + separator;

    @Override
    public void save(String mail, String text) throws IOException {
        File file = new File(string + separator + mail + ".txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write(text + "\n");
        }
    }

    @Override
    public String get(String mail) throws IOException {
        File file = new File(string + separator + mail + ".txt");
        String line;
        StringBuilder strBuild = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null) {
                strBuild.append(line);
            }
        }
        return strBuild.toString();
    }

    @Override
    public boolean update(String mail,String text) throws IOException {
        File file = new File(string + separator + mail + ".txt");
        if (!file.exists()) {
            return false;
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write(text + "\n");
        }
        return true;
    }

    @Override
    public boolean remove(String mail) {
        File file = new File(string + separator + mail + ".txt");
        return file.delete();
    }
}
