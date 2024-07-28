package com.skyhorsemanpower.chatService.common;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LocalDateTimeConverter implements Converter<String, LocalDateTime> {

    @Override
    public LocalDateTime convert(String source) {
        return LocalDateTime.parse(source, DateTimeFormatter.ISO_DATE_TIME);
    }
}
