package implementacija;

import interfejs.SqrtPowAbsCeilFloorInterface;

public class SqrtPowAbsCeilFloorImplementation implements SqrtPowAbsCeilFloorInterface {

    @Override
    public double sqrt(double broj) {
        return Math.sqrt(broj);

    }

    @Override
    public double pow(double broj, double broj1) {
        if (broj1 < 0) {
            throw new IllegalArgumentException();
        } else {
            return Math.pow(broj, broj1);
        }

    }

    @Override
    public double abs(double a) {
        return Math.abs(a);
    }

    @Override
    public double ceil(double a) {
        return Math.ceil(a);
    }

    @Override
    public double floor(double a) {
        return Math.floor(a);
    }

}
