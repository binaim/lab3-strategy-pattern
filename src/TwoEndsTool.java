import java.awt.*;
import java.awt.event.MouseEvent;

public class TwoEndsTool implements Tool{
    private final TwoEndsShape twoEndsShape;
    public TwoEndsTool(TwoEndsShape twoEndsShape) {
        this.twoEndsShape = twoEndsShape;
    }



    @Override
    public void mousePressed(MouseEvent e) {
        Point p = e.getPoint();
       twoEndsShape.drawOutline(p);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Point p = e.getPoint();
        twoEndsShape.drawShape(p);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point p = e.getPoint();
        twoEndsShape.drawEnd(p);

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseClicked(MouseEvent e) {



    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
