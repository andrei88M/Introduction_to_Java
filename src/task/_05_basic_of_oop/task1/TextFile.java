package task._05_basic_of_oop.task1;

public class TextFile {
    private File file;
    private Directory directory;

    public TextFile() {
    }

    public TextFile(String text, String dir) {
        file = new File(text);
        directory = new Directory(dir);
    }

    public void create(String dir){
        file = new File();
        directory = new Directory(dir);
    }

    public void addText(String text){
        file.addText(text);
    }

    public void delete(){
        file.delete();
    }

    public void rename(String name){
        directory.setDirectory(name);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
}
