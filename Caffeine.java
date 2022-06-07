import java.awt.*;

// java -cp . Caffeine
public class Caffeine{

    public static void main(String[] args) throws Exception{
        Robot hal = new Robot();
        while(true){
            hal.delay(1000 * 30);
			Point pt = MouseInfo.getPointerInfo().getLocation();
			hal.mouseMove(pt.x + 1, pt.y + 1);
			hal.mouseMove(pt.x - 1, pt.y - 1);
			pt = MouseInfo.getPointerInfo().getLocation();
        }
    }
}