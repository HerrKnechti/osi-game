import java.awt.event.*;

/**
 * Beschreiben Sie hier die Klasse MouseManager.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MouseManager implements MouseListener
{
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    @Override
     public void mouseExited(MouseEvent e) {
        
    }
    @Override
    public void 	mousePressed(MouseEvent e) {
        Main.currentGame.click(e.getPoint().x, e.getPoint().y);
    }
    @Override
    public void 	mouseReleased(MouseEvent e) {
        
    }
}
