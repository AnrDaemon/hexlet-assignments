package exercise;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class FileKV extends InMemoryKV {

    private Path fileStore;

    public FileKV(String filePath) {
        super();
        this.fileStore = Paths.get(filePath);
        if (Files.exists(this.fileStore)) {
            var content = Utils.deserialize(Utils.readFile(this.fileStore.toString()));
            addAll(content);
        }
    }

    public FileKV(String filePath, Map<String, String> initial) {
        this(filePath);
        addAll(initial);
    }

    private void flush() {
        Utils.writeFile(this.fileStore.toString(), Utils.serialize(super.toMap()));
    }

    @Override
    public void set(String key, String value) {
        super.set(key, value);
        flush();
    }

    @Override
    public void unset(String key) {
        super.unset(key);
        flush();
    }

    @Override
    public String get(String key, String defaultValue) {
        return super.get(key, defaultValue);
    }

    @Override
    public void addAll(Map<String, String> src) {
        super.addAll(src);
        flush();
    }
}
