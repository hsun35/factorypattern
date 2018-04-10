package com.example.hefen.factorypattern.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class URLFactoryTest {

    @Test
    public void createURL() {
        String input = "primary";
        String output;
        String expected = "www.google.com";
        URLService urlService = URLFactory.createURL(input);
        output = urlService.getURL();
        assertArrayEquals("error", expected.toCharArray(), output.toCharArray());

        input = "secondary";
        expected = "www.bing.com";
        urlService = URLFactory.createURL(input);
        output = urlService.getURL();
        assertArrayEquals("error", expected.toCharArray(), output.toCharArray());

        input = "tertiary";
        expected = "www.yahoo.com";
        urlService = URLFactory.createURL(input);
        output = urlService.getURL();
        assertArrayEquals("error", expected.toCharArray(), output.toCharArray());
    }
}