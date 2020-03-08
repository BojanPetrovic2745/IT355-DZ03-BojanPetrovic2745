package main;

import konfiguracija.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import servisi.KokoskaServis;
import servisi.MathServis;
import servisi.OvcaServis;
import servisi.PasServis;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = 
                new AnnotationConfigApplicationContext(Config.class);
               
        
        //  = new ClassPathXmlApplicationContext("config.xml");

        OvcaServis ovca = (OvcaServis) context.getBean("ovcaServis");
        PasServis pas = (PasServis) context.getBean("pasServis");
        KokoskaServis kokoska = (KokoskaServis) context.getBean("kokoskaServis");

        ovca.infoOvca();
        kokoska.infoKokoska();
        pas.infoPas();

        MathServis mathServis
                = (MathServis) context.getBean("mathServis");

        mathServis.getPow();
        mathServis.getSqrt();
        mathServis.getAbs();
        mathServis.getCeil();
        mathServis.getFloor();

    }

}
