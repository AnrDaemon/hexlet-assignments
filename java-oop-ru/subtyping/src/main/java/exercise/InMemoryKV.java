package exercise;

import java.util.HashMap;
import java.util.Map;

public class InMemoryKV implements KeyValueStorage {

    private Map<String, String> storage;

    public InMemoryKV() {
        this.storage = new HashMap<>();
    }

    public InMemoryKV(Map<String, String> src) {
        this.storage = new HashMap<>(src);
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return storage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(storage);
    }

    public void addAll(Map<String, String> src) {
        this.storage.putAll(src);
    }
}
