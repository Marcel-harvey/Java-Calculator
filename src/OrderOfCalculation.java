import java.util.ArrayList;

public class OrderOfCalculation {

    public static String calculate(ArrayList<String> oldList) {

        if (oldList.size() == 0) {
            return null;
        }

        ArrayList<String> originalList = new ArrayList<>(oldList);
        ArrayList<String> copyList = new ArrayList<>();
        String answer;

        /*
        This entire class is used to handle what order the calculation is supposed to be done in, according to maths
        The Arraylists are swapped between so that they can always be modified and not have any un needed values in them
         */
        if (oldList.contains("(") & oldList.contains(")")) {

            copyList.addAll(CheckBrackets.bracketsFirst(originalList));

            originalList.clear();
            originalList.addAll(copyList);
            copyList.clear();

        }

        for (String value : oldList) {

            if (value.equals("*") || value.equals("/")) {

                if (value.equals("*")) {

                    copyList.addAll(Operator.multiply(originalList));

                }

                else {

                    copyList.addAll(Operator.devise(originalList));

                }
                originalList.clear();
                originalList.addAll(copyList);
                copyList.clear();

            }

        }


        for (String value : oldList) {

            if (value.equals("+") || value.equals("-")) {

                if (value.equals("+")) {

                    copyList.addAll(Operator.add(originalList));

                }

                else {

                    copyList.addAll(Operator.subtract(originalList));

                }
                originalList.clear();
                originalList.addAll(copyList);
                copyList.clear();

            }

        }


        answer = originalList.get(0);

        return answer;


    }

}
