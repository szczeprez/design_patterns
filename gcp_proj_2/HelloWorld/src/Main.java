import com.parents.Latam.Latam;
import com.parents.Latam.NieLatam;
import org.parents.Kwacze.Kwacz;

public class Main {

    public static void main(String[] args) {

        Kaczka dzika = new DzikaKaczka();
        dzika.ustawKwacz();
        dzika.ustawLataj();
        dzika.wyswitl();

        Kaczka modelKaczki = new ModelKaczka();
        modelKaczki.ustawLatajInterface(new NieLatam());
        modelKaczki.ustawLataj();
        modelKaczki.ustawLatajInterface(new Latam());
        modelKaczki.ustawLataj();
        modelKaczki.ustawKwaczInterface(new Kwacz());
        modelKaczki.ustawKwacz();

        modelKaczki.wyswitl();

    }
}
