package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeConverterTest {

    private GradeConverter gradeConverter;

    @Before
    public void setUp() {
        gradeConverter = new GradeConverter();
    }

    @Test
    public void testConvert1() {
        assertEquals("A", gradeConverter.convert(100));
    }

    @Test
    public void testConvert2() {
        assertEquals("B", gradeConverter.convert(86));
    }

    @Test
    public void testConvert3() {
        assertEquals("C", gradeConverter.convert(76));
    }

    @Test
    public void testConvert4() {
        assertEquals("D", gradeConverter.convert(65));
    }
}