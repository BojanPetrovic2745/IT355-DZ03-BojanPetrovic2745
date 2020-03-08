package servisi;

import interfejs.Zivotinja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OvcaServis {

    @Autowired
    private Zivotinja ovca;

    public OvcaServis() {
    }

    public OvcaServis(Zivotinja ovca) {
        this.ovca = ovca;
    }

    public void infoOvca() {
        System.out.println("Način oglašavanja: " + ovca.nacinOglasavanja());
        System.out.println("Jel nahranjena?: " + ovca.nahranjena());
    }

}
