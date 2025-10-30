package com.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SampleSerenityTest {

    @Test
    public void sampleTest() {
        // This is a simple test to verify the Serenity setup
        String message = "Hello, Serenity!";
        assertThat(message).isEqualTo("Hello, Serenity!");
    }
}