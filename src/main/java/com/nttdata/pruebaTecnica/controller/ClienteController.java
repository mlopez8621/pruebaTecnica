package com.nttdata.pruebaTecnica.controller;

import com.nttdata.pruebaTecnica.model.Cliente;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para manejar las solicitudes de información de clientes.
 */
@RestController
@RequestMapping("/api")
public class ClienteController {

    @ApiOperation(value = "Obtiene información del cliente por tipo y número de documento")
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = "OK",
                    response = Cliente.class,
                    examples = @Example(value = {
                            @ExampleProperty(
                                    mediaType = "application/json",
                                    value = "{\"primerNombre\": \"Sergio\", \"segundoNombre\": \"Alejandro\", \"primerApellido\": \"López\", \"segundoApellido\": \"Espinosa\", \"telefono\": \"3041454977\", \"direccion\": \"Cr 37b sur No 9 - 03\", \"ciudadResidencia\": \"Bogotá-Colombia\"}"
                            )
                    })
            ),
    })

    /**
     * Recupera la información de un cliente basado en el tipo y número de documento.
     * Solo responde con datos de un cliente mockeado cuyo número de documento es "23445322".
     *
     * @param tipo   El tipo de documento, donde "C" es cédula y "P" es pasaporte.
     * @param numero El número de documento del cliente.
     * @return Una entidad de respuesta que contiene los datos del cliente o un mensaje de error.
     */
    @GetMapping("/cliente")
    public ResponseEntity<?> cliente(
            @RequestParam("tipo") String tipo,
            @RequestParam("numero") String numero) {
        try {
            // Validar que el tipo sea "C" para cédula o "P" para pasaporte
            if (!tipo.equals("C") && !tipo.equals("P")) {
                // Si el tipo de documento no es válido, devuelve un código de estado 400.
                return new ResponseEntity<>("Tipo de documento inválido", HttpStatus.BAD_REQUEST);
            }

            // Validar que el número de documento no esté vacío y sea el esperado
            if (numero.trim().isEmpty() || !numero.trim().equals("23445322")) {
                // Si el número de documento no es válido o no encontrado, devuelve un código de estado 404.
                return new ResponseEntity<>("Número de documento inválido o no encontrado", HttpStatus.NOT_FOUND);
            }

            // Si el tipo es "C" y el número es "23445322", retorna la información mockeada del cliente
            if (tipo.equals("C") && numero.equals("23445322")) {
                // Crear un nuevo cliente mockeado con información predeterminada.
                Cliente cliente = new Cliente(
                        "Michel", "Leonardo", "López", "Avendaño",
                        "3004555868", "Tv70 No 67b sur - 75 apto 1030", "Bogotá-Colombia");
                // Devuelve el cliente mockeado con un código de estado 200.
                return new ResponseEntity<>(cliente, HttpStatus.OK);
            } else {
                // Si no coincide el documento, se retorna un 404
                return new ResponseEntity<>("Cliente no encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            // Manejo de cualquier excepción inesperada con un código de estado 500.
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
