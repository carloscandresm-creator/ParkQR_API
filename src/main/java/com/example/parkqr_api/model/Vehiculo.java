package com.example.parkqr_api.model;

public class Vehiculo {

    private Long id;
    private String placa;
    private String tipo;
    private String apartamento;

    public Vehiculo() {
    }

    public Vehiculo(Long id, String placa, String tipo, String apartamento) {
        this.id = id;
        this.placa = placa;
        this.tipo = tipo;
        this.apartamento = apartamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }
}