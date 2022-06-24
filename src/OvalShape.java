import java.awt.*;

public class OvalShape implements TwoEndsShape{

    protected ScribbleCanvas canvas;
    protected int xStart, yStart;
    protected Graphics onscreen, offscreen;

    public OvalShape(ScribbleCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void drawShape(Point p) {

        canvas.mouseButtonDown = false;
        onscreen.setPaintMode();
        offscreen = canvas.getOffScreenGraphics();
        offscreen.drawOval(xStart, yStart, p.x-xStart+1, p.y-yStart+1);
        canvas.repaint();

    }

    @Override
    public void drawOutline(Point p) {

        canvas.mouseButtonDown = true;
        xStart = canvas.x = p.x;
        yStart = canvas.y = p.y;
        onscreen = canvas.getGraphics();
        onscreen.setXORMode(Color.darkGray);
        onscreen.setColor(Color.lightGray);

        onscreen.drawOval(xStart, yStart, 1, 1);

    }

    @Override
    public void drawEnd(Point p) {

        if (canvas.mouseButtonDown) {
            onscreen.drawOval(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1);
            onscreen.drawOval(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);
        }
        canvas.x = p.x;
        canvas.y = p.y;

    }
}
