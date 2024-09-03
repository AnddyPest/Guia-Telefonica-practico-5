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
    //apaga el boton enviado
    public static void apagarBotonConfirmar(JButton boton){
        boton.setEnabled(false);
    }
    //Habilita el boton enviado               
    public static void prenderBotonConfirmar(JButton boton){
        boton.setEnabled(true);
    }
    //Revisa si un campo de texto esta vacio, de ser así, muestra la etiqueta
    public static boolean revisarSiEstaVacio(JTextField campoArevisar,JLabel etiqueta ,JButton boton){
        
        if(campoArevisar.getText().strip().isEmpty()){
          
            etiqueta.setVisible(true);
            return true;
        }else{
            
            etiqueta.setVisible(false);            
            return false;
        }
        
        
    }
    //No deja que el usuario escriba otra cosa que no sean numeros en el campo de texto
    public static void noDejarIngresarNumeros(int activado,java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();
        if(activado == 1){
            boolean numero = key > 48 && key <= 57;
            
            if(!numero){
                evt.consume();
            }                        
        }
    }
    //Sobrecarga, permite agregarle un limite de numeros ingresados al campo de texto
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
    //Revisa si en el campo de texto solo hay numeros
    public static void revisarSiSoloSonNumeros(JTextField campoARevisar,JLabel etiquetaSoloNumeros ,JButton boton ){
        if(!campoARevisar.getText().matches("\\d+")){
            etiquetaSoloNumeros.setVisible(true);
            apagarBotonConfirmar(boton);
        } else{
            etiquetaSoloNumeros.setVisible(false);
            prenderBotonConfirmar(boton);
        }
    }
    //Comprueba si un JToggleButton esta seleccionado y de ser así lo pone de color verde, si no a su color default
    public static int comprobarSiElBotonEstaSeleccionado(JToggleButton botonSeleccionado,JButton botonEntrega,JTextField campoAIngresar, String nombreDelBoton,int cambiarEleccion){
        int eleccion = cambiarEleccion;
            campoAIngresar.setText("");
        if(botonSeleccionado.isSelected()){
            System.out.println("Boton " +  nombreDelBoton + " seleccionado");
            botonSeleccionado.setBackground(Color.GREEN);
            campoAIngresar.setText("Ingrese " + nombreDelBoton);
            botonEntrega.setEnabled(false);
        }else{
            System.out.println("Boton " + nombreDelBoton +" deSeleccionado");
            botonSeleccionado.setBackground(Color.getHSBColor(60, 63, 65));
        }
        return eleccion;
    }
    
    
}
