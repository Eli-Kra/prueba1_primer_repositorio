/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Ely
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Modelo mod = new Modelo();
       Vista view = new Vista();
       
       Controlador ctrl = new Controlador(view, mod);
       ctrl.iniciar();
       view.setVisible(true);
    }
    
}
