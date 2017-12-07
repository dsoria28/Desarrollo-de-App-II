/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.dsoria.model.bean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import utng.dsoria.services.webservices.TbMedallistas;

/**
 *
 * @author MENDOZA
 */
@ManagedBean(name = "medallistaBean1")
@SessionScoped
public class MedallistaBean {

    private Integer id;
    private String nombre;
    private String disciplina;
    private String categoria;
    private String medalla;
    private String pais;
    private String evento;
    /**
     * Creates a new instance of MedallistasBean
     */
    public MedallistaBean() {   
        
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setMedalla(String medalla) {
        this.medalla = medalla;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getMedalla() {
        return medalla;
    }

    public String getPais() {
        return pais;
    }

    public String getEvento() {
        return evento;
    }
    
    public void limpiarFormulario(){
        this.id=0;
        this.nombre="";
        this.disciplina="";
        this.categoria="";
        this.medalla="";
        this.evento="";
        this.pais="";
    }
    
    public String agregarMedallista(){
        String msj = ingresarMedallista(nombre, disciplina, categoria, medalla, pais, evento);
        FacesMessage msg = new FacesMessage (FacesMessage.SEVERITY_INFO, msj, "...");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        limpiarFormulario();
        return "index";
    }
    
    public String buscarMedallista(){
        String msj = buscarMedallista_1(id);
        FacesMessage msg = new FacesMessage (FacesMessage.SEVERITY_INFO, msj, "...");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        limpiarFormulario();
        return "index";
    }
    
    public List<TbMedallistas> getListaMed(){
        List<TbMedallistas> lista= consultarMedallistas();
        return lista;
    }

    private static String buscarMedallista_1(int id) {
        utng.dsoria.services.webservices.MedallistasWS_Service service = new utng.dsoria.services.webservices.MedallistasWS_Service();
        utng.dsoria.services.webservices.MedallistasWS port = service.getMedallistasWSPort();
        return port.buscarMedallista(id);
    }

    private static java.util.List<utng.dsoria.services.webservices.TbMedallistas> consultarMedallistas() {
        utng.dsoria.services.webservices.MedallistasWS_Service service = new utng.dsoria.services.webservices.MedallistasWS_Service();
        utng.dsoria.services.webservices.MedallistasWS port = service.getMedallistasWSPort();
        return port.consultarMedallistas();
    }

    private static String ingresarMedallista(java.lang.String nombre, java.lang.String disciplina, java.lang.String categoria, java.lang.String medalla, java.lang.String pais, java.lang.String evento) {
        utng.dsoria.services.webservices.MedallistasWS_Service service = new utng.dsoria.services.webservices.MedallistasWS_Service();
        utng.dsoria.services.webservices.MedallistasWS port = service.getMedallistasWSPort();
        return port.ingresarMedallista(nombre, disciplina, categoria, medalla, pais, evento);
    }
    
    
    
}
