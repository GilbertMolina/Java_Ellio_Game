package com.gilberth.game.state;

import com.gilberth.game.main.GameMain;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import com.gilberth.game.main.Resources;
import com.sun.media.jfxmedia.events.PlayerStateEvent;

/**
 *
 * @author Gilberth
 */
public class MenuState extends State{
    private int currentSelection = 0;

    @Override
    public void init() {
        //No implementado.
    }

    @Override
    public void update(float delta) {
        //No implementado.
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.welcome, 0, 0, null);
        if (currentSelection == 0) {
            g.drawImage(Resources.selector, 335, 241, null);
        } else {
            g.drawImage(Resources.selector, 335, 291, null);
        }
    }

    @Override
    public void onClick(MouseEvent e) {
        //No implementado.
    }

    @Override
    public void onKeyPress(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE || key == KeyEvent.VK_ENTER) {
            if (currentSelection == 0) {
                setCurrentState(new PlayState());
            } else if(currentSelection == 1){
                GameMain.sGame.exit();
            }
        } else if(key == KeyEvent.VK_UP){
            currentSelection = 0;
        } else if(key == KeyEvent.VK_DOWN){
            currentSelection = 1;
        }
    }

    @Override
    public void onKeyRelease(KeyEvent e) {
        //No implementado.
    }
    
}
