/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.awt.PageAttributes.MediaType.D;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
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
public class Alien extends Base{

   protected BufferedImage img;
   private int x = 683; //centro 

   
    public Alien() {
        
        try {
            img = ImageIO.read(new File("./src/img/messi.png"));
        } catch (IOException ex) {
            Logger.getLogger(Alien.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
   public void pinta(Graphics g) {
       //escalando imagem posx posy tamx tamy
      //  g.drawImage(img, x,500,x +100, 500+100,0,0,img.getWidth() ,img.getHeight() ,null);
           g.drawImage(img, x-200, 250, x-200, 500+50, null);
    }


}