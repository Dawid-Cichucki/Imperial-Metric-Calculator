import java.text.DecimalFormat;

public class ImperialToMetric {

    public double footToMeter(double foot){
        double meter = foot / 3.280840;
        return meter;
    }

    public double inchToCm(double inch){
        double cm = inch / 2.54;
        return cm;
    }

    public double poundToKg(double pound){
        double kg = pound * 0.45359237;
        return kg;
    }

    public double fahrToCel(double fahr){
        double cel = (fahr - 32) * 5 / 9;
        return cel;
    }

    public double galToLitre(double gal){
        double litre = gal / 4.546099;
        return litre;
    }

}
