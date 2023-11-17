/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_diegolara;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author diego
 */
public class carro {

    private String tipo;
    private String marca;
    private String modelo;
    private Color color;
    private double precio;
    ArrayList<String> mejoras = new ArrayList();
    private String pais;
    private Date año = new Date();

    public carro() {
    }

    public carro(String tipo, String marca, String modelo, Color color, double precio, String pais, Date fecha) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.pais = pais;
        this.año = fecha;
    }

    public String isTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getMejoras() {
        return mejoras;
    }

    public void setMejoras(ArrayList<String> mejoras) {
        this.mejoras = mejoras;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    @Override
    public String toString() {
        String cadenaFinal = "\nMarca: \n" + marca + "\n Modelo: \n" + modelo + "\n Color: \n" + color + "\n Precio: \n" + precio + "\n";

        if (mejoras.isEmpty()) {
            cadenaFinal += "\n No tiene mejoras";
        } else {
            for (String mejora : mejoras) {

                cadenaFinal += mejora;
            }
        }
        return cadenaFinal;
    }

}
