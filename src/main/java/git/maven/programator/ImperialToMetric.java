package git.maven.programator;



public class ImperialToMetric {

    public double footToMeter(double foot){
            if (foot < 0) {
                throw new IllegalArgumentException("less than 0");
            }
            double meter = foot / 3.280840;
            return meter;
    }

    public double inchToCm(double inch){
        if(inch < 0){
            throw new IllegalArgumentException("less than 0");
        }
        double cm = inch / 2.54;
        return cm;
    }

    public double poundToKg(double pound){
        if(pound < 0){
            throw new IllegalArgumentException("less than 0");
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
            throw new IllegalArgumentException("less than 0");
        }
        double litre = gal / 4.546099;
        return litre;
    }

}
