/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Proprietario
 */
public class Planodefundo {

    private BufferedImage img;
    private int y =0;
    
    
    public Planodefundo(){
    try {
            img = ImageIO.read(new File("./src/img/fundo.png"));
        } catch (IOException ex) {
            Logger.getLogger(Inimigo.class.getName()).log(Level.SEVERE, null, ex);
        } 
    y = 0;
}
    
    public void pinta(Graphics g){
        
                        //alt da t3la
        g.drawImage(img, 0,y - 768 * 2,img.getWidth(),img.getHeight(),null);
        g.drawImage(img,0,y,img.getWidth(),-img.getHeight(),null);//inv
        g.drawImage(img, 0,y,img.getWidth(),img.getHeight(),null);
        y +=3 ;
        if(y > 768 * 2){
            y = 0;
        }
    }  
    }

