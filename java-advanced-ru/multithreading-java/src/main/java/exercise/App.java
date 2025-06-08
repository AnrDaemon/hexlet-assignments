package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.logging.Level;

class App {
    private static final Logger LOGGER = Logger.getLogger("AppLogger");

    public static Map<String, Integer> getMinMax(int[] numbers) {
        var result = new HashMap<String, Integer>();
        var min = new MinThread(numbers);
        var max = new MaxThread(numbers);
        min.start();
        max.start();
        try {
            min.join();
            max.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        result.put("min", min.getResult());
        result.put("max", max.getResult());
        return result;
    }
}
