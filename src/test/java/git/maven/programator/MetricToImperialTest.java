package git.maven.programator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MetricToImperialTest {
    MetricToImperial metricToImperial = new MetricToImperial();

    @ParameterizedTest
    @ValueSource(doubles ={0.1,15,25.27,10000.1732})
    void cmToInches(double param){
        double expected = param * 2.54;
        Assertions.assertEquals(expected,metricToImperial.cmToInch(param));
    }

    @Test
    void cmToInchesForLessThanZero(){
        double test = -1;
        Assertions.assertEquals(test,metricToImperial.cmToInch(test));
    }

    @ParameterizedTest
    @ValueSource(doubles ={0.1,15,25.27,10000.1732})
    void kgToPounds(double param){
        double expected = param / 0.45359237;
        Assertions.assertEquals(expected,metricToImperial.kgToPound(param));
    }

    @Test
    void kgToPoundsForLessThanZero(){
        double test = -1;
        Assertions.assertEquals(test,metricToImperial.kgToPound(test));
    }

    @ParameterizedTest
    @ValueSource(doubles ={0.1,15,25.27,10000.1732})
    void metersToFeet(double param){
        double expected = param * 3.280840;
        Assertions.assertEquals(expected,metricToImperial.meterToFoot(param));
    }

    @Test
    void feetToMetersForLessThanZero(){
        double test = -1;
        Assertions.assertEquals(test,metricToImperial.meterToFoot(test));
    }

    @ParameterizedTest
    @ValueSource(doubles ={0.1,15,25.27,10000.1732})
    void litresToGallons(double param){
        double expected = param * 4.546099;
        Assertions.assertEquals(expected,metricToImperial.litreToGal(param));
    }

    @Test
    void litresToGallonsForLessThanZero(){
        double test = -1;
        Assertions.assertEquals(test,metricToImperial.litreToGal(test));
    }

    @ParameterizedTest
    @ValueSource(doubles ={0.1,15,25.27,10000.1732,-50})
    void  celToFahrs(double param){
        double expected = (param * 9 / 5) + 32;
        Assertions.assertEquals(expected,metricToImperial.celToFahr(param));
    }
}
