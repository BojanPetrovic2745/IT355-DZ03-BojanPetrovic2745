package servisi;

import interfejs.SqrtPowAbsCeilFloorInterface;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathServis {

    @Autowired
    private SqrtPowAbsCeilFloorInterface mathServis;

    public MathServis() {
    }

    public MathServis(SqrtPowAbsCeilFloorInterface mathServis) {
        this.mathServis = mathServis;
    }

    public void getSqrt() {

        System.out.println("Sqrt metoda");
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        double broj = sc.nextDouble();

        System.out.println("Koren " + mathServis.sqrt(broj));;
    }

    public void getPow() {

        System.out.println("Pow metoda");
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double broj = sc.nextDouble();

        System.out.println("Unesite drugi  broj: ");
        double broj1 = sc.nextDouble();

        System.out.println("Stepen " + mathServis.pow(broj, broj1));

    }

    public void getAbs() {

        System.out.println("Abs metoda");
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        double broj = sc.nextDouble();

        System.out.println("Apsolutna vrednost: " + mathServis.abs(broj));
    }

    public void getCeil() {

        System.out.println("Ceil metoda");
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        double broj = sc.nextDouble();

        System.out.println("Ceil: " + mathServis.ceil(broj));
    }

    public void getFloor() {

        System.out.println("Floor metoda ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        double broj = sc.nextDouble();

        System.out.println("Floor: " + mathServis.floor(broj));
    }
}
