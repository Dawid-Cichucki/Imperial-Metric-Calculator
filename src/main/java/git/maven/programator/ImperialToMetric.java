package git.maven.programator;

import java.text.DecimalFormat;

public class ImperialToMetric {

    public double footToMeter(double foot){
        if(foot < 0){
            System.out.println("error");
            return foot;
        }
        double meter = foot / 3.280840;
        return meter;
    }

    public double inchToCm(double inch){
        if(inch < 0){
            System.out.println("error");
            return inch;
        }
        double cm = inch / 2.54;
        return cm;
    }

    public double poundToKg(double pound){
        if(pound < 0){
            System.out.println("error");
            return pound;
        }
        double kg = pound * 0.45359237;
        return kg;
    }

    public double fahrToCel(double fahr){
        double cel = (fahr - 32) * 5 / 9;
        return cel;
    }

    public double galToLitre(double gal){
        if(gal < 0){
            System.out.println("error");
            return gal;
        }
        double litre = gal / 4.546099;
        return litre;
    }

}
