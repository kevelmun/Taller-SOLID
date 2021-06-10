/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre{
    public Helado(String sabor){
        super(sabor);
        setPrecioParcial(7.85);
    }
    

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + super.getSabor()+ ", precioParcial=" + super.getPrecioParcial()+ ", aderezos=" + super.getAderezos() + '}';
    }
    
    
    
}
