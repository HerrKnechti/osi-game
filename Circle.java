 
/**
 * Beschreiben Sie hier die Klasse Circle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Circle
{
    
    static final int RADIUS = 100;
    
    int radius;
    
    int x, y;
    
    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
        this.radius = RADIUS;
    }
    
    public void click() {
        
    }
    
    public void render() {
        //GraphicsController.gibFenster().fuelleKreis(x, y, radius, -1);
        GraphicsController.gibFenster().graphic.drawImage(Main.head, x - radius, y - radius, radius*2, radius*2, null);
    }
}
