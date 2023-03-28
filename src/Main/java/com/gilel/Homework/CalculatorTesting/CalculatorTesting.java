package com.gilel.Homework.CalculatorTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class CalculatorTesting {
    private static Calculator calculator;

    @BeforeAll
    public static void init(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Addition testing 2 + 2")
    public void testAddition(){
        int result = calculator.addition(2,2);
        Assertions.assertEquals(4, result, "Failed! " + result);
    }

    @Test
    @DisplayName("Subtraction testing 4 - 2")
    public void testSubtraction(){
        int result = calculator.subtraction(4,2);
        Assertions.assertEquals(2, result, "Failed! " + result);
    }

    @Test
    @DisplayName("Multiply testing 3 * 3")
    public void testMultiply(){
        int result = calculator.multiply(3,3);
        Assertions.assertEquals(9, result, "Failed! " + result);
    }

    @ParameterizedTest
    @MethodSource("valueProvider")
    @DisplayName("Division testing 3 / 3, 6 / 3 , 9 / 3")
    public void testDivision(int a, int b, int expected){
        int result = calculator.division(a, b);
        Assertions.assertEquals(result, expected, "Failed! " + result);
    }

    public static Stream<Arguments> valueProvider() {
        return Stream.of(
                Arguments.arguments(3, 3, 1),
                Arguments.arguments(6, 3, 2),
                Arguments.arguments(9, 3, 3));
    }
}
