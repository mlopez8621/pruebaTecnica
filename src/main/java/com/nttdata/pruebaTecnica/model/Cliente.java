package com.nttdata.pruebaTecnica.model;

import io.swagger.annotations.ApiModelProperty;

public class Cliente {
    @ApiModelProperty(value = "El primer nombre del cliente", example = "Sergio")
    private String primerNombre;

    @ApiModelProperty(value = "El segundo nombre del cliente", example = "Alejandro")
    private String segundoNombre;

    @ApiModelProperty(value = "El primer apellido del cliente", example = "López")
    private String primerApellido;

    @ApiModelProperty(value = "El segundo apellido del cliente", example = "Espinosa")
    private String segundoApellido;

    @ApiModelProperty(value = "El teléfono del cliente", example = "3041454977")
    private String telefono;

    @ApiModelProperty(value = "La dirección del cliente", example = "Cr 37b sur No 9 - 03")
    private String direccion;

    @ApiModelProperty(value = "La ciudad de residencia del cliente", example = "Bogotá-Colombia")
    private String ciudadResidencia;

    public Cliente(String primerNombre, String segundoNombre, String primerApellido,
                   String segundoApellido, String telefono, String direccion, String ciudadResidencia) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudadResidencia='" + ciudadResidencia + '\'' +
                '}';
    }
}

