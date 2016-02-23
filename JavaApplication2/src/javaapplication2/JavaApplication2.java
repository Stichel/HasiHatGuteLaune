/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.text.DecimalFormat;

/**
 *
 * @author Schule
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
    static long count = 0;
    static double rndX = 0.0;
    static double rndY = 0.0;
    
    public static void main(String[] args) {
        long AnzahlWuerfe = 100000000L;
        for(long i = 0; i<AnzahlWuerfe; i++){
            rndX = (double)(Math.random()*10)-6;
            rndY = (double)(Math.random()*5);
            //System.out.println("X: "+rndX);
            //System.out.println("Y: "+rndY);
            //System.out.println("Anzahl: "+count);
            if(rndX >= 0 && rndY <= 5.0 - 1.25 * rndX ){
                count++; 
            }
            else if(rndX <= 0 && rndY <= 5.0+5.0/6.0*rndX){
                count++;
            }
        }
        
        System.out.println("Soviele lagen im Dreieck: "+count);
        double Prozent = count/(double)AnzahlWuerfe*100;
        System.out.println("Soviele Prozent sind im 3-Eck: "+Prozent+"%");
        DecimalFormat format = new DecimalFormat("###.##########################################"); 
        javax.swing.JOptionPane.showMessageDialog(null, "Soviele lagen im Dreieck: "+count+"\nSoviele Prozent sind im 3-Eck: "+Prozent+"%");
        
        
    }
    
}
