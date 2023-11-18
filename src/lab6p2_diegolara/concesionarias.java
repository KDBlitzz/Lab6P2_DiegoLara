/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_diegolara;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class concesionarias {

    private String nombre;
    private String locación;
    private ArrayList<carro> carro = new ArrayList();

    public concesionarias(String nombre, String locación) {
        this.nombre = nombre;
        this.locación = locación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocación() {
        return locación;
    }

    public void setLocación(String locación) {
        this.locación = locación;
    }
    
}
