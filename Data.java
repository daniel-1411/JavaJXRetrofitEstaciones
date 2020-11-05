/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafxretrofit;

import java.util.List;

/**
 *
 * @author FP Mañana A
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {


@SerializedName("estacion_analizador_NO2")
@Expose
private String estacionAnalizadorNO2;
@SerializedName("estacion_analizador_SO2")
@Expose
private String estacion_analizador_SO2;
@SerializedName("estacion_municipio")
@Expose
private String estacionMunicipio;
@SerializedName("estacion_direccion_postal")
@Expose
private String estacionDireccionPostal;

    public Data(String estacionAnalizadorNO2, String estacion_analizador_SO2, String estacionMunicipio, String estacionDireccionPostal) {
        this.estacionAnalizadorNO2 = estacionAnalizadorNO2;
        this.estacion_analizador_SO2 = estacion_analizador_SO2;
        this.estacionMunicipio = estacionMunicipio;
        this.estacionDireccionPostal = estacionDireccionPostal;
    }

    public String getEstacionAnalizadorNO2() {
        return estacionAnalizadorNO2;
    }

    public void setEstacionAnalizadorNO2(String estacionAnalizadorNO2) {
        this.estacionAnalizadorNO2 = estacionAnalizadorNO2;
    }

    public String getEstacion_analizador_SO2() {
        return estacion_analizador_SO2;
    }

    public void setEstacion_analizador_SO2(String estacion_analizador_SO2) {
        this.estacion_analizador_SO2 = estacion_analizador_SO2;
    }

    public String getEstacionMunicipio() {
        return estacionMunicipio;
    }

    public void setEstacionMunicipio(String estacionMunicipio) {
        this.estacionMunicipio = estacionMunicipio;
    }

    public String getEstacionDireccionPostal() {
        return estacionDireccionPostal;
    }

    public void setEstacionDireccionPostal(String estacionDireccionPostal) {
        this.estacionDireccionPostal = estacionDireccionPostal;
    }

    @Override
    public String toString() {
        return "Data{" + "estacionAnalizadorNO2=" + estacionAnalizadorNO2 + ", estacion_analizador_SO2=" + estacion_analizador_SO2 + ", estacionMunicipio=" + estacionMunicipio + ", estacionDireccionPostal=" + estacionDireccionPostal + '\n';
    }



 

}