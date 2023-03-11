package Seminar_2_task_4;

/*
    Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
    который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        String text = "TEST";
        StringBuilder string = new StringBuilder();
        string.append(text.repeat(100));
        try {
            Writer(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

         public static void Writer(String text) throws IOException{
             try (FileWriter fw = new FileWriter("file.txt", false)) {
                 for (int i = 0; i < 100; i++) {
                     fw.write(text + '\n');
                 }
                 fw.flush();
             } catch (IOException e) {
                 throw new IOException(e.getMessage());
             }
         }

    }