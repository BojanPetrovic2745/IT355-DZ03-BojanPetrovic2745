package implementacija;

import interfejs.Zivotinja;

public class Pas implements Zivotinja {

    @Override
    public String nacinOglasavanja() {
        return "Wouf!";
    }

    @Override
    public String nahranjena() {
        return "Pas nahranjen";
    }

}
