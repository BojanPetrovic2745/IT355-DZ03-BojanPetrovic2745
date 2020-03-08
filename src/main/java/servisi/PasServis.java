package servisi;

import interfejs.Zivotinja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasServis {

    @Autowired
    private Zivotinja pas;

    public PasServis() {
    }

    public PasServis(Zivotinja pas) {
        this.pas = pas;
    }

    public void infoPas() {
        System.out.println("Način oglašavanja: " + pas.nacinOglasavanja());
        System.out.println("Jel nahranjena?: " + pas.nahranjena());
    }

}
