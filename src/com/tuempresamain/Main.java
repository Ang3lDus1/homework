package com.tuempresamain;

import com.tuempresa.modelo.Persona;
import com.tuempresa.servicio.PersonaService;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        
        personaService.agregarPersona(new Persona(1, "Luis", "Miguel", "Pérez", "López", "M", "1234567890101", 20, "Guatemala"));
        personaService.agregarPersona(new Persona(2, "Ana", "Maria", "González", "Rodríguez", "F", "9876543210123", 17, "Guatemala"));
        personaService.agregarPersona(new Persona(3, "Lucía", "Fernanda", "Martínez", "Sánchez", "F", "1029384756012", 22, "Guatemala"));
        
        System.out.println("Nombres completos de las personas:");
        personaService.imprimirNombresCompletos();
        
        System.out.println("\nPersonas mayores de edad:");
        List<Persona> mayoresDeEdad = personaService.obtenerMayoresDeEdad();
        mayoresDeEdad.forEach(persona -> System.out.println(persona.getNombreCompleto()));
        
        System.out.println("\nPersona específica buscada:");
        Optional<Persona> personaEspecifica = personaService.buscarPersonaEspecifica();
        personaEspecifica.ifPresent(persona -> System.out.println(persona.getNombreCompleto()));
    }
}
