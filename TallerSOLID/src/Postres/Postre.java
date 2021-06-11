/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Elix
 */
public class Postre {
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }
    //////////////////////////////////////////////////////////////
    public void anadirAderezo(Aderezo aderezo){
        aderezos.add(aderezo);
    }
    
    public void quitarAderezo(Aderezo aderezo){
        aderezos.remove(aderezo);
    }
    ///////////////////////////////////////////////////////////////

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }
    
    @Override
    public String toString() {
        return "Postre{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
   
}
