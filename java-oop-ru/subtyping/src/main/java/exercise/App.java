package exercise;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App {
    public static KeyValueStorage swapKeyValue(KeyValueStorage src) {
        var newMap = src.toMap().entrySet().stream()
                .collect(Collectors.toMap(Entry::getValue, Entry::getKey, (a, b) -> b, LinkedHashMap::new));

        return new InMemoryKV(newMap);
    }
}
