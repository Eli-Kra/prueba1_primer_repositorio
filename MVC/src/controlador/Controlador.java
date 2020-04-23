/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Ely
 */
public class Controlador implements ActionListener{
    
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model){
        this.view=view;
        this.model=model;
        this.view.botonMultiplicar.addActionListener(this);
        this.view.botonsuma.addActionListener(this);
        this.view.botondividir.addActionListener(this);
        this.view.botonrestar.addActionListener(this);
    
    }
    public void iniciar(){
        view.setTitle("MVC Calculos");
        view.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==view.botonMultiplicar){
            model.setNumero1(Integer.parseInt(view.txt1.getText()));
            model.setNumero2(Integer.parseInt(view.txt2.getText()));
            model.Multiplicar();
            view.txt3.setText(String.valueOf(model.getResultado()));
                        
        }
        else if(e.getSource()==view.botonsuma){
            model.setNumero1(Integer.parseInt(view.txt1.getText()));
            model.setNumero2(Integer.parseInt(view.txt2.getText()));
            model.Sumar();
            view.txt3.setText(String.valueOf(model.getResultado()));
        }
        else if(e.getSource()==view.botondividir){
            model.setNumero1(Integer.parseInt(view.txt1.getText()));
            model.setNumero2(Integer.parseInt(view.txt2.getText()));
            model.Dividir();
            view.txt3.setText(String.valueOf(model.getResultado()));
        }
        else if(e.getSource()==view.botonrestar){
            model.setNumero1(Integer.parseInt(view.txt1.getText()));
            model.setNumero2(Integer.parseInt(view.txt2.getText()));
            model.Restar();
            view.txt3.setText(String.valueOf(model.getResultado()));
        }
        
       
    }
   
   
}
