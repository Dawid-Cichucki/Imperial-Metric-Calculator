import java.text.DecimalFormat;

public class CalculatorMain {
    public static void main(String[] args) {
        ImperialToMetric itm = new ImperialToMetric();
        MetricToImperial mti = new MetricToImperial();
        double test = 5;
        DecimalFormat df2 = new DecimalFormat("#.##");

        System.out.println(df2.format(itm.fahrToCel(test)));
        System.out.println(df2.format(itm.footToMeter(test)));
        System.out.println(df2.format(itm.galToLitre(test)));
        System.out.println(df2.format(itm.inchToCm(test)));
        System.out.println(df2.format(itm.poundToKg(test)));

        System.out.println("~~~~~~~~~~");

        System.out.println(df2.format(mti.celToFahr(test)));
        System.out.println(df2.format(mti.cmToInch(test)));
        System.out.println(df2.format(mti.kgToPound(test)));
        System.out.println(df2.format(mti.litreToGal(test)));
        System.out.println(df2.format(mti.meterToFoot(test)));
    }
}
