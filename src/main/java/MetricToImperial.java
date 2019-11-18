import java.text.DecimalFormat;

public class MetricToImperial {


    public double meterToFoot(double meter){
        if(meter < 0){
            System.out.println("error");
            return meter;
        }
        double foot = meter * 3.280840;
        return foot;
    }

    public double cmToInch(double cm){
        if(cm < 0){
            System.out.println("error");
            return cm;
        }
        double inch = cm * 2.54;
        return inch;
    }

    public double kgToPound(double kg){
        if(kg < 0){
            System.out.println("error");
            return kg;
        }
        double pound = kg / 0.45359237;
        return pound;
    }

    public double celToFahr(double cel){
        double fahr = (cel * 9 / 5) + 32;
        return fahr;
    }

    public double litreToGal(double litre){
        if(litre < 0){
            System.out.println("error");
            return litre;
        }
        double gal = litre * 4.546099;
        return gal;
    }
}
