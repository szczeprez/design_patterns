import com.parents.Latam.Latam;
import org.parents.Kwacze.Kwacz;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        latamInterface = new Latam();
        kwaczInterface = new Kwacz();
    }


    @Override
    public void wyswitl() {
        System.out.println("Jestem Dzika Kaczką !!!");
    }
}

