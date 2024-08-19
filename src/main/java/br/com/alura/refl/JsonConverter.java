package br.com.alura.refl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonConverter {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public String toJson(Object object) {

        String json = "";

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Map<String, Object> mapper = new LinkedHashMap<>();
        Class<?> toJsonClass = object.getClass();

        Arrays.stream(toJsonClass.getDeclaredFields())
                .toList()
                .forEach(field -> {
                            field.setAccessible(true);
                            String key = field.getName();
                            Object value = null;
                            try {
                                value = field.get(object);
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }
                            mapper.put(key, value);
                        }
                );

        try {
            json = objectMapper.writeValueAsString(mapper);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return json;

    }

    public <T> T toObject(String json, Class<T> objectClass) {

        T object = null;

        try {
            object = objectMapper.readValue(json, objectClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("It is not working!");
        }

        return object;

    }

}
