package io.hexlet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class InputTag implements TagInterface {

    private final static String template = "<input type=\"%1$s\" value=\"%2$s\">";

    private final String type;
    private final String value;

    public String render() {
        return String.format(template, this.type, this.value);
    }
}
