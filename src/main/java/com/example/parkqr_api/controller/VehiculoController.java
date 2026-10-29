package com.example.parkqr_api.controller;

import com.example.parkqr_api.model.Vehiculo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    private final List<Vehiculo> vehiculos = new ArrayList<>();

    // Consultar todos los vehículos
    @GetMapping
    public List<Vehiculo> listarVehiculos() {
        return vehiculos;
    }

    // Registrar un vehículo
    @PostMapping
    public String registrarVehiculo(@RequestBody Vehiculo vehiculo) {

        if (vehiculo.getPlaca() == null || vehiculo.getPlaca().isBlank()) {
            return "Error: la placa es obligatoria";
        }

        if (vehiculo.getTipo() == null || vehiculo.getTipo().isBlank()) {
            return "Error: el tipo de vehículo es obligatorio";
        }

        if (vehiculo.getApartamento() == null || vehiculo.getApartamento().isBlank()) {
            return "Error: el apartamento es obligatorio";
        }

        vehiculos.add(vehiculo);

        return "Vehículo registrado correctamente";
    }
}