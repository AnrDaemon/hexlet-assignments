package exercise;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App {
    public static void swapKeyValue(KeyValueStorage src) {
        var newMap = src.toMap().entrySet().stream()
                .collect(Collectors.toMap(Entry::getValue, Entry::getKey, (a, b) -> b, LinkedHashMap::new));
        for (var e : src.toMap().entrySet()) {
            src.unset(e.getKey());
        }
        for (var e : newMap.entrySet()) {
            src.set(e.getKey(), e.getValue());
        }
    }
}
