package HomeWork2_5;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String[] head = {"value1", "value2", "value3"};
        int[][] arr = {{1, 2, 3}, {100, 200, 123}, {300, 400, 500}};
        AppData d = new AppData(head, arr);
        d.toConsole();                  // вывод в консоль
        d.toCSV("example.csv");            // вывод в (example.csv)
        d.read_CSV("HomeWork2_5.csv");         // чтение из (HomeWork2_5.csv)

    }
}