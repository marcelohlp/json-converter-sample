package br.com.alura.refl;

import br.com.alura.person.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonConverterTest {

    Person personTest = new Person(1L, "Marcelo", "123.456.789-10");

    String jsonTest = """
                {
                    "id": 1,
                    "name": "Marcelo",
                    "cpf": "123.456.789-10"
                }
                """;

    JsonConverter converter = new JsonConverter();
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void shouldConvertAnObjectToJson() throws JsonProcessingException {

        String json = converter.toJson(personTest);

        JsonNode expectedJsonNode = objectMapper.readTree(jsonTest);
        JsonNode actualJsonNode = objectMapper.readTree(json);

        Assertions.assertEquals(expectedJsonNode, actualJsonNode);

    }

    @Test
    public void shouldConverterAnJsonToObject() {

        Person personTest = converter.toObject(jsonTest, Person.class);

        Assertions.assertAll(
                () -> Assertions.assertEquals("1", personTest.getId().toString()),
                () -> Assertions.assertEquals("Marcelo", personTest.getName()),
                () -> Assertions.assertEquals("123.456.789-10", personTest.getCpf())
        );

    }
}
