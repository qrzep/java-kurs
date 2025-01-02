package pl.kurs.test.zad4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

//Zadanie 04:
//        dany jest plik liczby.txt
//        w ktorym w kazdym wierszu sa liczby rozdzielone spacja.
//        np:
//        1 2 3 4
//        10 20 30 40 50 70
//        1 3 2 55 4 3 222 4 6 7
//        itp
//        dla kazdej linii nalezy stworzyc raport w postaci:
//        - okreslic monotonicznosc ciagu
//        - znalezc mina, maxa w ciagu
//        - znalezc najpopularniejsza liczbe z ciagu
//        - stwierdzic czy miedzy min i max znajduja sie wszystkie mozliwe liczby naturalne.
public class Runner {
    public static void main(String[] args) {
//        int[] ciag1 = new int[]{0,0,0,0};
//        Sequencer.printReport(ciag1);
        try (
            Scanner scanner = new Scanner(new File("src/main/java/pl/kurs/test/zad4/liczby.txt"))
        ){
            while (scanner.hasNext()) {
                Sequencer.printReport(scanner.nextLine());
            }
            }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
