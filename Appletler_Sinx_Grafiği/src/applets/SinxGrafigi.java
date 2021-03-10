package applets;
// 10*(sinx) grafiği çizen program.
import java.applet.Applet;
import java.awt.Graphics;

public class SinxGrafigi extends Applet {

    public void paint(Graphics g) {

        for (double i = 0; i <= 6; i += 0.1) {
            g.drawLine(
                      (int) (20 * i),
                      100 - (int) (100 * (Math.sin(i))),
                      (int) (20 * (i + 0.1)),
                      100 - (int) (100 * (Math.sin(i + 0.1))));
        }
    }
}
    

