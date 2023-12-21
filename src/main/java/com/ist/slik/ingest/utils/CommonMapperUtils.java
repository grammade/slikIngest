package com.ist.slik.ingest.utils;

import org.mapstruct.Named;

public class CommonMapperUtils {

    @Named("stringToChar")
    public static char stringToChar(String string) {
        return string.charAt(0);
    }

    @Named("charToString")
    public static String charToString(char character) {
        return String.valueOf(character);
    }
}
