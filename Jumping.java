/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumping;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 @author : Yuri Domingos ( UCAN : Universidade Católica de Angola )
 * Data    : 5 - 12 - 2020
 * Objectivo : Realizar movimentos automáticos com o teclado ( De maneira Extremamente FÁCIL )
 */
public class Jumping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        JFrame frame = new JFrame(" Funning");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400,400));
        frame.getContentPane().add(new Cenario());
        frame.show();
    }
    
}
