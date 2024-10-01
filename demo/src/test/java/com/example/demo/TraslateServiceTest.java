package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraslateServiceTest {
    @Test

    public void testTranslate() {
        // Arrange: Preparamos los datos de entrada y el resultado esperado
        String input1 = "hola";
        String expectedOutput1 = "hello";

        String input2 = "adiós";
        String expectedOutput2 = "goodbye";

        // Act: Llamamos al método a probar
        String actualOutput1 = TraslateService.translate(input1);
        String actualOutput2 = TraslateService.translate(input2);

        // Assert: Verificamos que los resultados sean los esperados
        assertEquals(expectedOutput1, actualOutput1, "La traducción de 'hola' debe ser 'hello'");
        assertEquals(expectedOutput2, actualOutput2, "La traducción de 'adiós' debe ser 'goodbye'");
    }
}