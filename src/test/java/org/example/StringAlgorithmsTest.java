package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringAlgorithmsTest {

    @Test
    public void revertStringTest() {
        var strings = new String[] {
                "abc",
                "bcdasdasgdsaf",
                "spysdasdojgasp"
        };
        var revertedStrings = new String[strings.length];

        for(var i = 0; i < strings.length; ++i) {
            var reversedStringBuilder = new StringBuilder(strings[i]);
            revertedStrings[i] = reversedStringBuilder.reverse().toString();
        }

        for(var i = 0; i < strings.length; ++i) {
            var customReverted = StringAlgorithms.revertString(strings[i]);
            assertEquals(customReverted, revertedStrings[i]);
        }
    }

}