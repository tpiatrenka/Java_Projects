package hw_7.task_6;

import java.time.*;
import java.time.format.DateTimeFormatter;

//+ Только комментарии съехали трохи
//Написать benchmark тест, который бы измерял скорость работы String, StringBuilder и StringBuffer.
//Вывести на экран результаты замеров при помощи LocalDateTime. Данные должны отображаться в формате часы:минуты:секунды
public class Main {
    public static void main(String[] args) {
        String string = "";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 400_000; i++) { //я на лекции не добавила, но лучше 400_000 закинуть в переменную
            string += "A";
        }
        long endTime = System.currentTimeMillis();

        LocalDateTime date =
                Instant.ofEpochMilli(endTime - startTime)
                        .atZone(ZoneId.of("UTC"))
                        .toLocalDateTime();

        System.out.println("String " + dateTimeFormatter.format(date));
//StringBuilder 
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 400_000; i++) {
            sb.append("A");
        }
        endTime = System.currentTimeMillis();
        date =
                Instant.ofEpochMilli(endTime - startTime)
                        .atZone(ZoneId.of("UTC"))
                        .toLocalDateTime();
        System.out.println("StringBuilder " + dateTimeFormatter.format(date));
//StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbb = new StringBuffer();
        for (int i = 0; i < 400_000; i++) {
            sb.append("A");
        }
        endTime = System.currentTimeMillis();
        date =
                Instant.ofEpochMilli(endTime - startTime)
                        .atZone(ZoneId.of("UTC"))
                        .toLocalDateTime();
        System.out.println("StringBuffer " + dateTimeFormatter.format(date));
    }
}
