package org.example.i18n;

import org.example.i18n.config.I18nConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

public class I18nTest {
    public static void main(String[] args) {
//        System.out.println(Locale.TAIWAN);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(I18nConfiguration.class);

        Object[] objects = {"Perry"};

        String app = context.getMessage("app", null, Locale.US);
        String welcome = context.getMessage("welcome", objects, LocaleContextHolder.getLocale());
        System.out.println(app);
        System.out.println(welcome);
    }
}
