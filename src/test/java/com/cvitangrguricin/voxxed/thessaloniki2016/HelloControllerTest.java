package com.cvitangrguricin.voxxed.thessaloniki2016;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloControllerTest {
	
	private HelloController controller = new HelloController();

    @Test
    public void Should_ReturnHello() {
        // when
        String result = controller.hello();

        // then
        assertEquals("hello1", result);
    }

}
