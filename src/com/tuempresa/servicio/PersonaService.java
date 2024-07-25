package com.tuempresa.servicio;

import com.tuempresa.modelo.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonaService {
    private List<Persona> personas = new ArrayList<>();

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public List<Persona> obtenerPersonas() {
        return personas;
    }

    public void imprimirNombresCompletos() {
        personas.stream()
                .map(Persona::getNombreCompleto)
                .forEach(System.out::println);
    }

    public List<Persona> obtenerMayoresDeEdad() {
        return personas.stream()
                       .filter(persona -> persona.getEdad() >= 18)
                       .collect(Collectors.toList());
    }

    public Optional<Persona> buscarPersonaEspecifica() {
        return personas.stream()
                       .filter(persona -> persona.getEdad() >= 18)
                       .filter(persona -> "Guatemala".equals(persona.getCiudad()))
                       .filter(persona -> persona.getPrimerNombre().contains("Lu"))
                       .findFirst();
    }
}
