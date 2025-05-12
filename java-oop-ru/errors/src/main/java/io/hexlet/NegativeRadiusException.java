package io.hexlet;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NegativeRadiusException extends Exception {
    public NegativeRadiusException(String m) {
        super(m);
    }
}
