package org.example;

public class StringAlgorithms {
    public static String revertString(String str) {
        char[] chars = str.toCharArray();
        for(var i = 0; i < chars.length / 2; ++i) {
            var buff = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = buff;
        }

        return new String(chars);
    }
}
