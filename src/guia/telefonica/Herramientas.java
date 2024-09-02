/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia.telefonica;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author Max
 */
public class Herramientas {
    public static void apagarBotonConfirmar(JButton boton){
        boton.setEnabled(false);
    }
                         
    public static void prenderBotonConfirmar(JButton boton){
        boton.setEnabled(true);
    }
    public static void revisarSiEstaVacio(JTextField campoArevisar, JButton boton){
        
        if(campoArevisar.getText().strip().isEmpty()){
            apagarBotonConfirmar(boton);
            
        }else{
            prenderBotonConfirmar(boton);
            
        }
        
    }
    public static void noDejarIngresarNumeros(int activado,java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();
        if(activado == 1){
            boolean numero = key > 48 && key <= 57;
            
            if(!numero){
                evt.consume();
            }
            
            
        }
    }
    public static void noDejarIngresarNumeros(int activado, java.awt.event.KeyEvent evt, JTextField campoDeTexto, int limite){
        int key = evt.getKeyChar();
        if(activado == 1){
            boolean numero = key > 48 && key <= 57;
            
            if(!numero){
                evt.consume();
            }
            
            if(campoDeTexto.getText().trim().length() == limite){
                evt.consume();
            }
        }
    }
    public static void revisarSiSoloSonNumeros(JTextField campoARevisar,JLabel etiquetaSoloNumeros ,JButton boton ){
        if(!campoARevisar.getText().matches("\\d+")){
            etiquetaSoloNumeros.setVisible(true);
            apagarBotonConfirmar(boton);
        } else{
            etiquetaSoloNumeros.setVisible(false);
            prenderBotonConfirmar(boton);
        }
    }
    public static int comprobarSiElBotonEstaSeleccionado(JToggleButton botonSeleccionado, String nombreDelBoton,int cambiarEleccion){
        int eleccion = cambiarEleccion;
        if(botonSeleccionado.isSelected()){
            System.out.println("Boton " +  nombreDelBoton + " seleccionado");
            botonSeleccionado.setBackground(Color.GREEN);
        }else{
            System.out.println("Boton " + nombreDelBoton +" deSeleccionado");
            botonSeleccionado.setBackground(Color.getHSBColor(60, 63, 65));
        }
        return eleccion;
    }
    
    
}
