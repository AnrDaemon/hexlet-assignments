package io.hexlet;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;

@Getter
public class PairedTag extends Tag {

    private static final String TEMPLATE_TRAIL = "</%s>";

    private final String content;
    private final List<Tag> children = new ArrayList<>();

    public PairedTag(String tagName, Map<String, String> attributes, String content, List<Tag> children) {
        super(tagName, attributes);
        this.content = content;
        this.children.addAll(children);
    }

    public String contentRender() {
        return content + this.getChildren().stream().map(Object::toString).collect(Collectors.joining())
                + String.format(TEMPLATE_TRAIL, this.getTagName());
    }
}
