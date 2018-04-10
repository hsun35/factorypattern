package com.example.hefen.factorypattern.util;

public class URLFactory {
    public static URLService createURL (String url) {
        if (url.equals("primary")) {
            return new URLPrimary();
        } else if (url.equals("secondary")) {
            return new URLSecondary();
        } else if (url.equals("tertiary")) {
            return new URLTertiary();
        }
        throw new IllegalArgumentException("No such url");
    }
}
