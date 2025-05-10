package io.hexlet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Tag {
    private static final String TEMPLATE_LEAD = "<%1$s%2$s>";
    private static final String TEMPLATE_ATTRIBUTE = " %1$s=\"%2$s\"";

    private final String tagName;
    private final Map<String, String> attributes = new LinkedHashMap<>();

    public Tag(String tagName, Map<String, String> attributes) {
        this(tagName);
        this.attributes.putAll(attributes);
    }

    public String tagRender() {
        return String.format(TEMPLATE_LEAD, this.getTagName(), this.attributesRender());
    }

    public String attributesRender() {
        return this.getAttributes().entrySet().stream()
                .map((v) -> String.format(TEMPLATE_ATTRIBUTE, v.getKey(), v.getValue()))
                .collect(Collectors.joining());
    }

    public String contentRender() {
        return "";
    }

    public String toString() {
        return this.tagRender() + this.contentRender();
    }
}
