package hw_10.task_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileNameFormatter fnf = new FileNameFormatter();
        fnf.rename("src/hw_10/task_2/file_to_rename.txt", RenameStrategy.LOWERCASE);
    }
}
