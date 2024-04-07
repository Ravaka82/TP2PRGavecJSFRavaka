package org.apache.maven.tp2prgavecjsfravaka.jsf;

import java.util.ArrayList;
import java.util.List;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.servlet.http.HttpServletRequest;

@Named(value = "bean2")
@RequestScoped
public class Bean2 {

   private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }

    public String afficher() {
        return "affichage_4?nb=" + nombre + "&amp;faces-redirect=true";
    }
}
