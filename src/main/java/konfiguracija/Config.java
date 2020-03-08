package konfiguracija;

import aspekti.MathAspect;
import implementacija.Kokoska;
import implementacija.Ovca;
import implementacija.Pas;
import implementacija.SqrtPowAbsCeilFloorImplementation;
import interfejs.SqrtPowAbsCeilFloorInterface;
import servisi.KokoskaServis;
import servisi.OvcaServis;
import servisi.PasServis;
import interfejs.Zivotinja;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import servisi.MathServis;

@Configuration
@EnableAspectJAutoProxy
public class Config {

    @Bean(name = "kokoska")
    public Zivotinja getKokoska() {
        return new Kokoska();
    }

    @Bean(name = "ovca")
    public Zivotinja getOvca() {
        return new Ovca();
    }

    @Bean(name = "pas")
    public Zivotinja getPas() {
        return new Pas();
    }

    @Bean(name = "kokoskaServis")
    public KokoskaServis getKokoskaServis() {
        return new KokoskaServis();
    }

    @Bean(name = "ovcaServis")
    public OvcaServis getOvcaServis() {
        return new OvcaServis();
    }

    @Bean(name = "pasServis")
    public PasServis getPasServis() {
        return new PasServis();
    }

    @Bean(name = "mathAspect")
    public MathAspect getAspect() {
        return new MathAspect();
    }

    @Bean(name = "sqrtPowAbsCeilFloor")
    public SqrtPowAbsCeilFloorInterface getImpl() {
        return new SqrtPowAbsCeilFloorImplementation();
    }

    @Bean(name = "mathServis")
    public MathServis getMathServis() {
        return new MathServis();
    }

}
