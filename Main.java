import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.io.File;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author Julius van Voorden
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
    public static Game currentGame;
    
    public static BufferedImage head;
    
    public static void main(String[] args) {
        GraphicsController.gibFenster().setzeTitel("Counter-Strike: Global Offensive 2");
        currentGame = new Game();
        currentGame.start();
        
        
        try {
            File file = new File("head.png");
            head = ImageIO.read(file);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
