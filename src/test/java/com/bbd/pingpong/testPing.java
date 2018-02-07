package com.bbd.pingpong;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPing {
    @Test
    public void testNumber1() {
        assertEquals(1,RomanConverter.Convert("I"));
    }

    @Test
    public void testNumber2() {
        assertEquals(5, RomanConverter.Convert("V"));
    }

    @Test
    public void testNumber3() {
        assertEquals(3, RomanConverter.Convert("III"));
    }

    @Test
    public void testNumber5() {
        assertEquals(5, RomanConverter.Convert("v"));
    }

    @Test
    public void test2DifferentNumber() {
        assertEquals(6, RomanConverter.Convert("VI"));
    }

    @Test
    public void testNumber7() {
        assertEquals(7, RomanConverter.Convert("VII"));
    }

    @Test
    public void testNumber8() {
        assertEquals(8, RomanConverter.Convert("VIII"));
    }

    @Test
    public void testNumber9() {
        assertEquals(109, RomanConverter.Convert("CDIV"));

    }

    @Test
    public void testNumber20() {
        assertThrows(RuntimeException.class,()-> RomanConverter.Convert("--"));

    }
    @Test
    public void testNumber21() {
        assertEquals(19, RomanConverter.Convert("XIX"));
    }
/*
    @Test
    public void testNumber10() {
        assertEquals(10, RomanConverter.Convert("X"));
    }

    @Test
    public void testNumber11() {
        assertEquals(11, RomanConverter.Convert("XI"));
    }

    @Test
    public void testNumber12() {
        assertEquals(12, RomanConverter.Convert("XII"));
    }

    @Test
    public void testNumber13() {
        assertEquals(13, RomanConverter.Convert("XIII"));
    }

    @Test
    public void testNumber15() {
        assertEquals(15, RomanConverter.Convert("XV"));
    }
    */

}