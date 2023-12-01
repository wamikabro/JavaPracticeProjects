package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest extends TestCase {

    @Test
    public void testMain() {
        // Redirect System.out to capture the printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the main method
        App.main(new String[]{});

        // Reset System.out to the original PrintStream
        System.setOut(System.out);

        // Verify the output
        assertEquals("Han Jani", outContent.toString().trim());
    }
}