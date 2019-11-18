import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ImperialToMetricTest {
    ImperialToMetric imperialToMetric = new ImperialToMetric();

    @ParameterizedTest
    @ValueSource(doubles ={0.1,15,25.27,10000.1732})
    void inchesToCm(double param){
        double expected = param / 2.54;
        Assertions.assertEquals(expected,imperialToMetric.inchToCm(param));
    }

    @Test
    void inchesToCmForLessThanZero(){
        double test = -1;
        Assertions.assertEquals(test,imperialToMetric.inchToCm(test));
    }

    @ParameterizedTest
    @ValueSource(doubles ={0.1,15,25.27,10000.1732})
    void poundsToKg(double param){
        double expected = param * 0.45359237;
        Assertions.assertEquals(expected,imperialToMetric.poundToKg(param));
    }

    @Test
    void poundsToKgForLessThanZero(){
        double test = -1;
        Assertions.assertEquals(test,imperialToMetric.poundToKg(test));
    }

    @ParameterizedTest
    @ValueSource(doubles ={0.1,15,25.27,10000.1732})
    void feetToMeters(double param){
        double expected = param / 3.280840;
        Assertions.assertEquals(expected,imperialToMetric.footToMeter(param));
    }

    @Test
    void feetToMetersForLessThanZero(){
        double test = -1;
        Assertions.assertEquals(test,imperialToMetric.footToMeter(test));
    }

    @ParameterizedTest
    @ValueSource(doubles ={0.1,15,25.27,10000.1732})
    void gallonsToLitres(double param){
        double expected = param / 4.546099;
        Assertions.assertEquals(expected,imperialToMetric.galToLitre(param));
    }

    @Test
    void gallonsToLitresForLessThanZero(){
        double test = -1;
        Assertions.assertEquals(test,imperialToMetric.galToLitre(test));
    }

    @ParameterizedTest
    @ValueSource(doubles ={0.1,15,25.27,10000.1732,-50})
    void fahrsToCel(double param){
        double expected = (param - 32) * 5 / 9;
        Assertions.assertEquals(expected,imperialToMetric.fahrToCel(param));
    }

    

}
