package com.gilberth.game.model;

import java.awt.Rectangle;
import com.gilberth.framework.util.RandomNumberGenerator;

/**
 *
 * @author Gilberth Molina
 */
public class Block {

    private float x, y;
    private int width, height;
    private Rectangle rect;
    private boolean visible;
    private static final int UPPER_Y = 268, LOWER_Y = 355;

    public Block(float x, float y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        rect = new Rectangle((int) x, (int) y, width, height);
        visible = false;
    }

    public void update(float delta, float velX) {
        x += velX * delta;
        if (x <= -50) {
            reset();
        }
        updateRect();
    }

    private void updateRect() {
        rect.setBounds((int) x, (int) y, width, height);
    }

    private void reset() {
        visible = true;
        if (RandomNumberGenerator.getRandInt(3) == 0) {
            y = UPPER_Y;
        } else {
            y = LOWER_Y;
        }
        x += 1000;
    }

    public void onCollide(Player p) {
        visible = false;
        p.pushBack(30);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Rectangle getRect() {
        return rect;
    }

    public boolean isVisible() {
        return visible;
    }

}
