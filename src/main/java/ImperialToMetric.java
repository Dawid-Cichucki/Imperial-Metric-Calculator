import java.text.DecimalFormat;

public class ImperialToMetric {
DecimalFormat df2 = new DecimalFormat("#.###");
    public double footToMeter(double foot){
        double meter = foot / 3.280840;
        df2.format(meter);
        return meter;
    }

    public double inchToCm(double inch){
        double cm = inch / 2.54;
        df2.format(cm);
        return cm;
    }

    public double poundToKg(double pund){
        double kg = pund * 0.45359237;
        df2.format(kg);
        return kg;
    }

    public double fahrToCel(double fahr){
        double cel = (fahr - 32) * (5/9);
        df2.format(cel);
        return cel;
    }

    public double galToLitre(double gal){
        double litre = gal / 4.546099;
        df2.format(litre);
        return litre;
    }

}
