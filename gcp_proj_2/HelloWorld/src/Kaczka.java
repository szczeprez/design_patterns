import com.parents.Latam.Latam;
import com.parents.Latam.LatamInterface;
import org.parents.Kwacze.Kwacz;
import org.parents.Kwacze.KwaczInterface;

public abstract class Kaczka {

    LatamInterface latamInterface;
    KwaczInterface kwaczInterface;


    public void ustawKwaczInterface(KwaczInterface kw){
        kwaczInterface = kw;
    }

    public void ustawLatajInterface(LatamInterface la){
        latamInterface = la;
    }


    public void ustawKwacz(){
        kwaczInterface.kwacz();
    }

    public void ustawLataj(){
        latamInterface.lec();
    }

    public abstract void wyswitl();

}
