package ch07_importFunction;

import java.io.*;

/*
File:
exists() - проверяет существование
getName() - имя в виде строки
length() - размер в байтах
createNewFile() - создаёт новый файл
delete() - удаление файла
renameTo() - переименование
list() - массив файлов или каталогов в виде строки
 */
public class ListFiles {
    public static void main(String[] args) {
        File dir = new File("src/ch06_classes");


        if (dir.exists()) {
            System.out.println("Директория найдена");
            String[] files = dir.list();
            System.out.println(files.length + " файлов/каталогов найдено...");
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        }
        else {
            System.out.println("Каталог не найден.");
        }
    }

}
