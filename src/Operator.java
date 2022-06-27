import java.util.ArrayList;

public class Operator {

    public static ArrayList<String> devise(ArrayList<String> oldList) {

        int value;
        int first;
        int second;
        double answer;

        ArrayList<String> copyList = new ArrayList<>(oldList);

        for (String s : oldList) {

            if (s.equalsIgnoreCase("/")){

                value = copyList.indexOf(s);
                first = copyList.indexOf(s) - 1;
                second = copyList.indexOf(s) + 1;

                if (copyList.get(second).equals("-")) {
                    String third = copyList.get(second) + copyList.get(second+1);

                    answer = Double.parseDouble(copyList.get(first)) / Double.parseDouble(third);

                    copyList.add(value +1, String.valueOf(answer));

                    copyList.remove(value +3);

                }

                else {
                    answer = Double.parseDouble(copyList.get(first)) / Double.parseDouble(copyList.get(second));

                    copyList.add(value +1, String.valueOf(answer));

                }

                copyList.remove(value +2);
                copyList.remove(value);
                copyList.remove(value -1);

            }

        }

        return copyList;

    }


    public static ArrayList<String> multiply(ArrayList<String> oldList) {

        int value;
        int first;
        int second;
        double answer;

        ArrayList<String> copyList = new ArrayList<>(oldList);

        for (String s : oldList) {

            if (s.equalsIgnoreCase("*")){

                value = copyList.indexOf(s);
                first = copyList.indexOf(s) - 1;
                second = copyList.indexOf(s) + 1;

                if (copyList.get(second).equals("-")) {
                    String third = copyList.get(second) + copyList.get(second+1);

                    answer = Double.parseDouble(copyList.get(first)) * Double.parseDouble(third);

                    copyList.add(value +1, String.valueOf(answer));

                    copyList.remove(value +3);

                }

                else {
                    answer = Double.parseDouble(copyList.get(first)) * Double.parseDouble(copyList.get(second));

                    copyList.add(value +1, String.valueOf(answer));

                }

                copyList.remove(value +2);
                copyList.remove(value);
                copyList.remove(value -1);

            }

        }

        return copyList;

    }


    public static ArrayList<String> add(ArrayList<String> oldList) {

        int value;
        int first;
        int second;
        double answer;

        ArrayList<String> copyList = new ArrayList<>(oldList);

        for (String s : oldList) {
            if (s.equalsIgnoreCase("+")){

                value = copyList.indexOf(s);
                first = copyList.indexOf(s) - 1;
                second = copyList.indexOf(s) + 1;

                if (copyList.get(second).equals("-")) {
                    String third = copyList.get(second) + copyList.get(second+1);

                    answer = Double.parseDouble(copyList.get(first)) + Double.parseDouble(third);

                    copyList.add(value +1, String.valueOf(answer));

                    copyList.remove(value +3);

                }

                else {
                    answer = Double.parseDouble(copyList.get(first)) + Double.parseDouble(copyList.get(second));

                    copyList.add(value +1, String.valueOf(answer));

                }

                copyList.remove(value +2);
                copyList.remove(value);
                copyList.remove(value -1);


            }

        }

        return copyList;

    }


    public static ArrayList<String> subtract(ArrayList<String> oldList) {

        int value;
        int first;
        int second;
        double answer;

        ArrayList<String> copyList = new ArrayList<>(oldList);

        for (String s : oldList) {
            if (s.equalsIgnoreCase("-")){

                value = copyList.indexOf(s);
                first = copyList.indexOf(s) - 1;
                second = copyList.indexOf(s) + 1;

                if (copyList.get(second).equals("-")) {
                    String third = copyList.get(second) + copyList.get(second+1);

                    answer = Double.parseDouble(copyList.get(first)) - Double.parseDouble(third);

                    copyList.add(value +1, String.valueOf(answer));

                    copyList.remove(value +3);

                }

                else {
                    answer = Double.parseDouble(copyList.get(first)) - Double.parseDouble(copyList.get(second));

                    copyList.add(value +1, String.valueOf(answer));

                }

                copyList.remove(value +2);
                copyList.remove(value);
                copyList.remove(value -1);

            }

        }

        return copyList;

    }

}
