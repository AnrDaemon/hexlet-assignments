package io.hexlet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LabelTag implements TagInterface {

    private final static String template = "<label>%1$s%2$s</label>";

    private final String textContent;
    private final TagInterface child;

    public String render() {
        return String.format(template, this.textContent, this.child.render());
    }
}
