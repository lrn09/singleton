package creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int value : source) {
            if (value > f) {
                logger.log("Элемент " + value + " проходит");
                result.add(value);
            } else {
                logger.log("Элемент " + value + " не проходит");
            }
        }

        return result;
    }
}
