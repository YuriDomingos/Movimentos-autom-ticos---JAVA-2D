/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumping;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author : Yuri Domingos ( UCAN : Universidade Católica de Angola )
 * Data    : 5 - 12 - 2020
 * Objectivo : Realizar movimentos automáticos com o teclado ( De maneira Extremamente FÁCIL )
 */
public class Cenario extends JPanel implements ActionListener, KeyListener  {

    private Timer timer; 
    private int x = 0, y = 0 , velX = 0, velY = 0;
    

    public Cenario() {
        
         timer = new Timer(20,this);
        
        timer.start();
        addKeyListener(this);
        setFocusable(true);
        //setFocusTraversalKeysEnabled(false); // desnecessário
      
        
    }
    
    
    
    public void paintComponent(Graphics g)
    {
        
        
        super.paintComponent(g);
       
        Graphics2D graphics2D = (Graphics2D) g.create();
        
        graphics2D.clearRect(0, 0, this.getWidth(), this.getHeight());
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
    
        graphics2D.setColor(Color.BLACK);
        graphics2D.fill(new Rectangle2D.Double(x+30,y+30,200,50));
        graphics2D.setColor(Color.WHITE);
        graphics2D.drawString("ÉS MUITO LINDA ENGENHEIRA.... ",x+35, y+55);
        graphics2D.setFont(new Font("Serief",Font.BOLD,8));
        graphics2D.drawString("És inteligente e já percebeste de quem falo. ",x+32, y+75);
     
        
         
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
         
        x = x + velX;
        y = y + velY;
        
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
      
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    
        int choose = ke.getKeyCode();
        
        switch(choose)
        {
            case KeyEvent.VK_LEFT :
                
                 velX = -1;
                 velY =  0;
                 
               break;
               
            case KeyEvent.VK_UP :
                
                  velX =   0;
                  velY =  -1;
                  
               break;
               
            case  KeyEvent.VK_RIGHT :
                
                  velX = 1;
                  velY = 0;
                
               break;
               
            case KeyEvent.VK_DOWN :
                
                 velX = 0;
                 velY = 1;
                 
                break;
                
            default :
                
                JOptionPane.showMessageDialog(null, "Error Inavlid option ","Presta mais ",JOptionPane.INFORMATION_MESSAGE);
                
                
        }
        
      
    }
    
  
    
    

    @Override
    public void keyReleased(KeyEvent ke) {
   
        
        //-- Para parar o movimento após o click de uma tecla
        
        velX = 0;
        velY = 0;
    }
    
    
    
    
    
  }  
