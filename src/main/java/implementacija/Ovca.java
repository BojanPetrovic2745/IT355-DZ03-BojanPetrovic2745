package implementacija;

import interfejs.Zivotinja;

public class Ovca implements Zivotinja {

    @Override
    public String nacinOglasavanja() {
        return "Be!";
    }

    @Override
    public String nahranjena() {
        return "Ovca je nahranjena!";
    }

}
