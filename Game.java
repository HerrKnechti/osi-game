import java.util.*;
import java.io.File;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

/**
 * Beschreiben Sie hier die Klasse Game.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Game
{   
    public List<Circle> circles = new ArrayList<>();
    Random random = new Random();
    BufferedImage photo = null;
    
    public Game() {
        
        try {
            File file = new File("wallpaper.jpg");
            photo = ImageIO.read(file);
        } catch (IOException e){
            e.printStackTrace();
        }
        GraphicsController.gibFenster().graphic.drawImage(photo, 0, 0, GraphicsController.gibFenster().gibMasse().width, GraphicsController.gibFenster().gibMasse().height, null);

    }
    
    public void click(int x, int y) {
        Circle found = null;
        for (Circle circle : circles) {
            int dX = Math.abs(x - circle.x);
            int dY = Math.abs(y - circle.y);
            double distance = Math.sqrt(dX * dX + dY * dY);
            if (distance < circle.radius) {
                circle.click();
                found = circle;
            }
        }
        
        if (found != null) {
            circles.remove(found);
            newCircle();
        }
        
        render();
    }
    
    public void render() {
        GraphicsController.gibFenster().loescheAlles();
        GraphicsController.gibFenster().graphic.drawImage(photo, 0, 0, GraphicsController.gibFenster().gibMasse().width, GraphicsController.gibFenster().gibMasse().height, null);
        for (Circle circle : circles) {
            circle.render();
        }
    }
    
    public void start() {
         newCircle();   
         newCircle();   
         newCircle();   
    }
    
    public void newCircle() {
        Circle circle = new Circle(random.nextInt(GraphicsController.gibFenster().gibMasse().width),random.nextInt(GraphicsController.gibFenster().gibMasse().height));
        circles.add(circle);
        circle.render();
    }
}
