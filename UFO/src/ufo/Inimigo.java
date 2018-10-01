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
public class Inimigo {
    private BufferedImage ini;
    private int x;
    private int y;
    private int velocidade;
    private int direcao;
    public Inimigo(int inicioX,int inicioY,int direcao) {
     
   
        try {
            ini = ImageIO.read(new File("./src/img/inimigo.png"));
        } catch (IOException ex) {
            Logger.getLogger(Inimigo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.x = inicioX;
        this.y = inicioY;
        this.direcao = direcao;
        this.velocidade = 2;
}
 public void pinta(Graphics g) {
       //escalando imagem posx posy tamx tamy
        g.drawImage(ini, x,y,x +50, y+50,0,0,ini.getWidth(),ini.getHeight(),null);
    }  

public void atualizar(){
 x += velocidade * direcao;
} 

public void trocadirecao(){
    direcao = direcao * - 1;
    y += 25;
    velocidade+=0.7;
}
public int getX(){
    return x;
}
public int getY(){
    return y;
}
}
