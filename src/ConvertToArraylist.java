import java.util.ArrayList;
import java.util.Arrays;

public class ConvertToArraylist {

    public static ArrayList<String> asList(String calculationString) {

        if (calculationString.length() == 0) {
            return new ArrayList<>();
        }

        /*
         Add white space in front and after all the operators so it can be used to split there
         May replace later with regular expression
        */
        calculationString = calculationString.replace("+", " + ");
        calculationString = calculationString.replace("-", " - ");
        calculationString = calculationString.replace("*", " * ");
        calculationString = calculationString.replace("/", " / ");
        calculationString = calculationString.replace("(", " ( ");
        calculationString = calculationString.replace(")", " ) ");

        // Split by the white space created beforehand and then converted to an Arraylist
        String[] splitCalculate = calculationString.split(" ");
        ArrayList<String> toCalculateList = new ArrayList<>(Arrays.asList(splitCalculate));

        toCalculateList.removeIf(value -> value.equals(""));
        toCalculateList.removeIf(vale -> vale.equals(" "));

        return toCalculateList;
    }

}
