package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TraslateService {
    private final Map<String, String> translationMap;

    public TranslateService() {
        translationMap = new HashMap<>();
        // Agregamos algunas traducciones
        translationMap.put("hola", "hello");
        translationMap.put("adiós", "goodbye");
        translationMap.put("gracias", "thank you");
        translationMap.put("por favor", "please");
        translationMap.put("sí", "yes");
        translationMap.put("no", "no");
    }

    // Cambiar el método translate a no estático
    public String translate(String text) {
        // Convertir el texto a minúsculas para facilitar la búsqueda
        String lowerText = text.toLowerCase();

        // Si la palabra está en el mapa, retornamos la traducción; si no, retornamos un mensaje de error
        return translationMap.getOrDefault(lowerText, "Translation not found");
    }
}
