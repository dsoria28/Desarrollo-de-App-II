/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.utng.dsoria.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author MENDOZA
 */
public class Acto implements Serializable{
    private String id;
    private String fecha;
    private String cod;

    public Acto(String id, String fecha, String cod) {
        this.id = id;
        this.fecha = fecha;
        this.cod = cod;
    }

    public Acto() {
        this("0","","");
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCod() {
        return cod;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
