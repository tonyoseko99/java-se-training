package com.systechafrica.part4.localization;

import java.util.Locale;
import java.util.Locale.Builder;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("locale: " + locale);
        locale = new Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        System.out.println(locale);
    }
}
