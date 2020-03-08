package implementacija;

import interfejs.Zivotinja;

public class Kokoska implements Zivotinja {

    @Override
    public String nacinOglasavanja() {
        return "Ko ko da!";
    }

    @Override
    public String nahranjena() {
        return "Kokoska nahranjena!";
    }

}
