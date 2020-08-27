//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
    public double x;
    public double y;
    public int wigth;
    public int heigth;

    public Enemy(int x, int y) {
        this.x = (double)x;
        this.y = (double)y;
        this.wigth = 40;
        this.heigth = 3;
    }

    public void tick() {
        this.x += (Game.ball.x - this.x - 6.0D) * 0.08D;
    }

    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect((int)this.x, (int)this.y, this.wigth, this.heigth);
    }
}
