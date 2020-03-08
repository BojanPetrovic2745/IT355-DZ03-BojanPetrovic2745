package aspekti;

import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MathAspect {

    private Log log = LogFactory.getLog(this.getClass());

    @Before("execution(* interfejs.SqrtPowAbsCeilFloorInterface.sqrt(double))")
    public void logBefore() {
        log.info("Metod sqrt() pocinje ");
    }

    @After("execution(* implementacija.SqrtPowAbsCeilFloorImplementation.abs(double))")
    public void logAfter() {
        log.info("Metod abs() se zavrsio ");
    }

    @AfterThrowing("execution(* implementacija.SqrtPowAbsCeilFloorImplementation.pow(double,double))")
    public void logAfterThrowing() {
        log.info("Metod pow() je izbacio izuzetak ");
    }

    @AfterThrowing("execution(* implementacija.SqrtPowAbsCeilFloorImplementation.ceil(double))")
    public void logAfterReturning() {
        log.info("Metod ceil() je vratio rezultat");
    }

    @Around("execution(* implementacija.SqrtPowAbsCeilFloorImplementation.floor(double))")
    public Object logAround(ProceedingJoinPoint jp) throws Throwable {
        log.info("Metoda " + jp.getSignature().getName() + "() pocinje sa " + Arrays.toString(jp.getArgs()));
        try {
            Object result = jp.proceed();
            log.info("Metoda " + jp.getSignature().getName() + "() zavrsava sa " + result);
            return result;

        } catch (IllegalArgumentException e) {
            log.error("Nedozvoljeni argumenti : " + Arrays.toString(jp.getArgs()) + " u metodi " + jp.getSignature().getName() + "()");
            throw e;
        }

    }

}
