package com.example.sweater;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DambPasswodEncoderTest {

    @Test
    void encode() {
        DambPasswodEncoder dambPasswodEncoder = new DambPasswodEncoder();

        Assert.assertEquals("My secret", dambPasswodEncoder.encode("My secret"));
        Assert.assertThat(dambPasswodEncoder.encode("My secret"), Matchers.containsString("My secret"));
    }
}