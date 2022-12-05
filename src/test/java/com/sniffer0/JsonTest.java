package com.sniffer0;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonTest {

    @Test
    void jsonReader() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src/test/resources/flip.json");
        Human human = objectMapper.readValue(jsonFile, Human.class);
        assertThat(human.getAge()).isEqualTo(50);
        assertThat(human.getPeople()).isEqualTo("Human");
        assertThat(human.getItems()).contains("arrows");
        assertThat(human.getItems()).contains("bowl");
        assertThat(human.getItems()).contains("shield");
    }
}
