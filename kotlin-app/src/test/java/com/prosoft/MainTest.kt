package com.prosoft

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName

class MainTest {

    private lateinit var calculator: Calculator
    private lateinit var stringUtils: StringUtils

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
        stringUtils = StringUtils()
    }

    @Test
    @DisplayName("Проверка сложения двух чисел")
    fun `test addition`() {
        val result = calculator.add(5, 3)
        assertEquals(8, result)
    }

    @Test
    @DisplayName("Проверка вычитания двух чисел")
    fun `test subtraction`() {
        val result = calculator.subtract(10, 4)
        assertEquals(6, result)
    }

    @Test
    @DisplayName("Проверка умножения на ноль")
    fun `test multiplication by zero`() {
        val result = calculator.multiply(5, 0)
        assertEquals(0, result)
    }

    @Test
    @DisplayName("Проверка деления чисел")
    fun `test division`() {
        val result = calculator.divide(15, 3)
        assertEquals(5, result)
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    fun `test division by zero`() {
        assertThrows(ArithmeticException::class.java) {
            calculator.divide(10, 0)
        }
    }

    @Test
    @DisplayName("Проверка реверса строки")
    fun `test string reverse`() {
        val result = stringUtils.reverse("hello")
        assertEquals("olleh", result)
    }

    @Test
    @DisplayName("Проверка пустой строки")
    fun `test empty string`() {
        val result = stringUtils.reverse("")
        assertEquals("", result)
        assertTrue(stringUtils.isEmpty(""))
    }

    @Test
    @DisplayName("Проверка на null")
    fun `test null string`() {
        assertTrue(stringUtils.isEmpty(null))
    }

    @Test
    @DisplayName("Проверка палиндрома")
    fun `test palindrome`() {
        assertTrue(stringUtils.isPalindrome("radar"))
        assertFalse(stringUtils.isPalindrome("hello"))
    }
}

// Простые классы для тестирования
class Calculator {
    fun add(a: Int, b: Int): Int = a + b
    fun subtract(a: Int, b: Int): Int = a - b
    fun multiply(a: Int, b: Int): Int = a * b
    fun divide(a: Int, b: Int): Int {
        if (b == 0) throw ArithmeticException("Division by zero")
        return a / b
    }
}

class StringUtils {
    fun reverse(str: String?): String {
        return str?.reversed() ?: ""
    }

    fun isEmpty(str: String?): Boolean {
        return str.isNullOrEmpty()
    }

    fun isPalindrome(str: String): Boolean {
        return str == str.reversed()
    }
}