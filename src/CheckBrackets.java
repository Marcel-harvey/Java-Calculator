import java.util.ArrayList;

public class CheckBrackets {

    public static boolean isDigit(String value) {

        try {

             Integer.parseInt(value);

        }

        catch (NumberFormatException nfe) {

            return false;

        }

        return true;

    }


    public static ArrayList<String> bracketsFirst(ArrayList<String> oldList) {

        int firstIndex = 0;
        int secondIndex = 0;
        boolean operandBefore;
        boolean operandAfter;
        String answer;

        ArrayList<String> copyList = new ArrayList<>(oldList);
        ArrayList<String> bracketList = new ArrayList<>();


        // Get the index of the brackets so that it can be sliced from the Arraylist to do separate calculations
        for (String value : oldList) {

            if (value.equals("(")) {

                firstIndex = copyList.indexOf(value);

            }

            if (value.equals(")")) {

                secondIndex = copyList.indexOf(value);

            }

        }


        // Add the values between the brackets to a separate Arraylist
        for (int i = firstIndex + 1; i < secondIndex; i++) {

            bracketList.add(bracketList.size(), oldList.get(i));

        }


        answer = OrderOfCalculation.calculate(bracketList);

        try {

            operandBefore = isDigit(oldList.get(firstIndex - 1));

        }

        catch (IndexOutOfBoundsException e) {

            operandBefore = false;

        }

        try {

            operandAfter = isDigit(oldList.get(secondIndex + 1));

        }
        catch (IndexOutOfBoundsException e) {

            operandAfter = false;

        }



        // Remove the old values including the brackets from the original Arraylist
        copyList.subList(firstIndex, secondIndex + 1).clear();

        copyList.add(firstIndex, answer);

        if (operandBefore) {

            copyList.add(firstIndex, "*");

        }

        if (operandAfter) {

            copyList.add(secondIndex - 2, "*");

        }

        return copyList;

    }

}
