/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.utng.dsoria.dom;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.utng.dsoria.model.Acto;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author MENDOZA
 */
public class ActoDOM {
    private String pathFile
            = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\ROOT\\GSI\\ActoVandalico\\src\\java\\data\\actos.xml";
    
    public void add(Acto data) {
        try {
            Document d = DOMHelper.getDocument(pathFile);
            Element actos = d.getDocumentElement();
            Element acto = d.createElement("acto");
            Element id = d.createElement("id");
            id.appendChild(d.createTextNode(data.getId()));
            acto.appendChild(id);
            Element fecha = d.createElement("fecha");
            fecha.appendChild(d.createTextNode(data.getFecha()));
            acto.appendChild(fecha);
            Element cod = d.createElement("cod");
            cod.appendChild(d.createTextNode(data.getCod()));
            acto.appendChild(cod);
            actos.appendChild(acto);
            DOMHelper.saveXMLContent(d, pathFile);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(String id) {
        try {
            Document d = DOMHelper.getDocument(pathFile);
            NodeList nl = d.getElementsByTagName("acto");
            for (int i = 0; i < nl.getLength(); i++) {
                Element item = (Element) nl.item(i);
                if (item.getElementsByTagName("id").item(0).
                        getTextContent().equals(id)) { 
                    item.getParentNode().removeChild(item); 
                    DOMHelper.saveXMLContent(d, pathFile);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void update(Acto data) {
        try {
            Document d = DOMHelper.getDocument(pathFile);
            NodeList nl = d.getElementsByTagName("acto");
            for (int i = 0; i < nl.getLength(); i++) {
                Element item = (Element) nl.item(i);
                if (item.getElementsByTagName("id").item(0).
                        getTextContent().equals(data.getId())) { 
                    item.getElementsByTagName("id").item(0).setTextContent(data.getId());
                    item.getElementsByTagName("fecha").item(0).setTextContent(data.getFecha());
                    item.getElementsByTagName("cod").item(0).setTextContent(data.getCod()); 
                    DOMHelper.saveXMLContent(d, pathFile);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Acto findById(String id) {
        Acto act = null;
        try {
            Document d = DOMHelper.getDocument(pathFile);
            NodeList nl = d.getElementsByTagName("acto");
            for (int i = 0; i < nl.getLength(); i++) {
                Element item = (Element) nl.item(i);
                if (item.getElementsByTagName("id").item(0).
                        getTextContent().equals(id)) { 
                    act = new Acto();
                    act.setId(id);
                    act.setFecha(item.getElementsByTagName("fecha").item(0).getTextContent());//
                    act.setCod(item.getElementsByTagName("cod").item(0).getTextContent());//
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return act;
    }
    
    public List<Acto> getAll(){
        List<Acto> actos= new ArrayList();
        Acto acto;
        try{
            Document d= DOMHelper.getDocument(pathFile);
            NodeList nl=d.getElementsByTagName("acto");
            for(int i=0; i<nl.getLength();i++){
                Element item= (Element)nl.item(i);
                acto=new Acto();
                acto.setId(item.getElementsByTagName("id").item(0)
                        .getTextContent());
                acto.setFecha(item.getElementsByTagName("fecha").item(0).getTextContent());
                acto.setCod(item.getElementsByTagName("cod").item(0).getTextContent());
                actos.add(acto);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return actos;
    }
}
