import java.text.DecimalFormat;

public class MetricToImperial {
    DecimalFormat df2 = new DecimalFormat("#.##");

    public double meterToFoot(double meter){
        double foot = meter * 3.280840;
        df2.format(foot);
        return foot;
    }

    public double cmToInch(double cm){
        double inch = cm * 2.54;
        df2.format(inch);
        return inch;
    }

    public double kgToPound(double kg){
        double pound = kg / 0.45359237;
        df2.format(pound);
        return pound;
    }

    public double celToFahr(double cel){
        double fahr = (cel * (5 / 9)) + 32;
        df2.format(fahr);
        return fahr;
    }

    public double litreToGal(double litre){
        double gal = litre * 4.546099;
        df2.format(gal);
        return gal;
    }
}
