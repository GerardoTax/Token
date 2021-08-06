/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicatoken;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Manejadores {
    private Ventana ventana;
    
    
    public Manejadores(Ventana ventana){
        this.ventana=ventana;
    }
    public void separarPalabras() {
    
        String frace= ventana.getjTextField1().getText();
        int inicio=0;
        for(int i=0; i<frace.length();i++){
         
          String spacio=String.valueOf(frace.charAt(i));
          if(spacio.equals(" ")){
                 System.out.println("es un espacio  " +i);
                String p= frace.substring(inicio, i);
                
                if(p.endsWith(" {}") || p.endsWith("[]") || p.endsWith(";") || p.endsWith(",") ){
                    ventana.getjTextArea1().append("Simbolo "+p);
                    ventana.getjTextArea1().append(System.getProperty("line.separator"));
                  
                }
            
             /* else if(p.endsWith("E") && (p.endsWith("0") || p.endsWith("1") ||p.endsWith("2") || p.endsWith("3") || p.endsWith("4")
                    || p.endsWith("5")|| p.endsWith("6") || p.endsWith("7") || p.endsWith("8") || p.endsWith("9"))   ){
                            
                        for(int z=0; z<p.length(); z++ ){
                            String punto=String.valueOf(p.charAt(z));
                                if(punto.equals(".")){
                                    ventana.getjTextArea1().append("Decimal "+p);
                                    ventana.getjTextArea1().append(System.getProperty("line.separator"));
                                }
                                
                        }
                 }*/
                 
                else if(p.endsWith("2") || p.endsWith("0") ||p.endsWith("1") || p.endsWith("3") || p.endsWith("4")
                    || p.endsWith("5")|| p.endsWith("6") || p.endsWith("7") || p.endsWith("8") || p.endsWith("9")){
                        ventana.getjTextArea1().append("Entero"+p);
                        ventana.getjTextArea1().append(System.getProperty("line.separator"));
                          
                }
                else {
                    ventana.getjTextArea1().append("Error "+p);
                    ventana.getjTextArea1().append(System.getProperty("line.separator"));
                }
             
                inicio=i;
            }
        }
    }
    
}
