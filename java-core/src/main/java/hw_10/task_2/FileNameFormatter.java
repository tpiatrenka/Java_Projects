package hw_10.task_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

//+- Метод должен принимать путь к папке и переименовывать все файлы внутри - нужно немного доделать, а так хорошо
//Есть папка с файлами, которые нужно переименовать.
//Реализуйте паттерн "стратегия" при помощи Enum для переименования файлов:
//- имя файла маленькими буквами
//- первая бука в имени файла с большой буквы, а остальные маленькие
//- имя файла написано кэпс локом (все буквы большие)
//Напишите класс, у которого будет метод принимающий текущее имя файла и стратегию для переименования.
public class FileNameFormatter {
    public void rename(String name, RenameStrategy strategy) {
        File currentFile = new File(name);
        String newFileName = strategy.name(currentFile.getName());

        File f = new File(currentFile.getParent(), newFileName);
        currentFile.renameTo(f);
    }
}
