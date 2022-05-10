package creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int m;
        int f;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Начало работы программы");
        logger.log("Введите размер списка");
        n = scanner.nextInt();
        logger.log("и верхнюю границу значений");
        m = scanner.nextInt();

        logger.log("Размер списка: " + n +
                ", Граница значений: " + m);
        logger.log("Создается список");
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            integerList.add(random.nextInt(m));
        }
        logger.log("Список создан. Элементы списка: " + integerList);
        logger.log("Введите порог для фильтра");
        f = scanner.nextInt();
        logger.log("Значение фильтра: " + f);
        logger.log("Запускаем фильтрацию изначального списка");

        Filter filter = new Filter(f);
        logger.log("Отфильтрованный список : " + filter.filterOut(integerList).toString());
        logger.log("Завершение программы");

    }
}
