package com.gilberth.game.main;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import com.gilberth.framework.animation.Animation;
import com.gilberth.framework.animation.Frame;

/**
 *
 * @author Gilberth
 */
public class Resources {
    
    public static BufferedImage welcome, iconImage, block, cloud1, cloud2, duck, 
                                grass, jump, run1, run2, run3, run4, run5, selector;
    public static AudioClip hit, onJump;
    public static Color skyBlue;
    public static Animation runAnim;
    
    public static void load(){
        welcome = loadImage("welcome.png");
        iconImage = loadImage("iconImage.png");
        block = loadImage("block.png");
        cloud1 = loadImage("cloud1.png");
        cloud2 = loadImage("cloud2.png");
        duck = loadImage("duck.png");
        grass = loadImage("grass.png");
        jump = loadImage("jump.png");
        run1 = loadImage("runAnim1.png");
        run2 = loadImage("runAnim2.png");
        run3 = loadImage("runAnim3.png");
        run4 = loadImage("runAnim4.png");
        run5 = loadImage("runAnim5.png");
        selector = loadImage("selector.png");
        hit = loadSound("hit.wav");
        onJump = loadSound("onJump.wav");
        skyBlue = new Color(208, 244, 247);
        
        Frame f1 = new Frame(run1, .1f);
        Frame f2 = new Frame(run2, .1f);
        Frame f3 = new Frame(run3, .1f);
        Frame f4 = new Frame(run4, .1f);
        Frame f5 = new Frame(run5, .1f);
        runAnim = new Animation(f1, f2, f3, f4, f5, f3, f2);
    }
    
    private static AudioClip loadSound(String filename){
        URL fileURL = Resources.class.getResource("/resources/" + filename);
        return Applet.newAudioClip(fileURL);
    }
    
    private static BufferedImage loadImage(String filename){
        BufferedImage img = null;
        try {
            img = ImageIO.read(Resources.class.getResourceAsStream("/resources/" + filename));
        } catch (Exception e) {
            System.out.println("Error while reading: " + filename);
            e.printStackTrace();
        }
        return img;
    }
    
}
