public class Converter {

    public static String barToPSI(String barValue) {

        double psiValue = Double.parseDouble(barValue) * 14.75;

        return String.valueOf(psiValue);

    }


    public static String psiToBar(String psiValue) {

        double barValue = Double.parseDouble(psiValue) / 14.75;

        return String.valueOf(barValue);

    }


    public static String kiloToMile(String kilometer) {

        double mile = Double.parseDouble(kilometer) / 1.6;

        return String.valueOf(mile);

    }


    public static String mileToKilo(String mile) {

        double kilometer = Double.parseDouble(mile) * 1.6;

        return String.valueOf(kilometer);

    }

}
