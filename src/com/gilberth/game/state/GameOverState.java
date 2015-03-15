package com.gilberth.game.state;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import com.gilberth.game.main.GameMain;

/**
 *
 * @author Gilberth Molina
 */
public class GameOverState extends State{
    private String playerScore;
    private Font font;

    public GameOverState(int playerScore) {
        this.playerScore = playerScore + "";
        this.font = new Font("SansSerif", Font.BOLD, 50);
    }

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
        g.setColor(Color.ORANGE);
        g.fillRect(0, 0, GameMain.GAME_WIDTH, GameMain.GAME_HEIGHT);
        g.setColor(Color.DARK_GRAY);
        g.setFont(font);
        g.drawString("Juego Terminado", 200, 150);
        g.drawString("Puntuación obtenida: " + playerScore, 125, 250);
        g.drawString("Presione cualquier tecla", 110, 350);
    }

    @Override
    public void onClick(MouseEvent e) {
        //No implementado.
    }

    @Override
    public void onKeyPress(KeyEvent e) {
        setCurrentState(new MenuState());
    }

    @Override
    public void onKeyRelease(KeyEvent e) {
        //No implementado.
    }
    
}
