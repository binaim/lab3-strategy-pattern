import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ScribbleCanvasListener implements MouseListener, MouseMotionListener {
    protected JDrawFrame drawFrame;


    public ScribbleCanvasListener( JDrawFrame drawFrame) {
        this.drawFrame = drawFrame;

    }
    public void mousePressed(MouseEvent e) {
        drawFrame.getCurrentTool().mousePressed(e);
    }

    public void mouseReleased(MouseEvent e) {
        drawFrame.getCurrentTool().mouseReleased(e);
    }

    public void mouseDragged(MouseEvent e) {
        drawFrame.getCurrentTool().mouseDragged(e);

    }



    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
}
