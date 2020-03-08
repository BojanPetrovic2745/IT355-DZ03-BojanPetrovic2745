package servisi;

import interfejs.Zivotinja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KokoskaServis {

    @Autowired
    private Zivotinja kokoska;

    public KokoskaServis() {
    }

    public KokoskaServis(Zivotinja kokoska) {
        this.kokoska = kokoska;
    }

    public void infoKokoska() {
        System.out.println("Način oglašavanja: " + kokoska.nacinOglasavanja());
        System.out.println("Jel nahranjena?: " + kokoska.nahranjena());
    }

}
