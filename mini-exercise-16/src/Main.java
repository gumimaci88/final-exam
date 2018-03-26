import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<String>(Arrays.asList("Boys", "will", "be", "boys."));
        char letterToJoin = '-';

        System.out.println(joinStringsWithLetter(listOfStrings, letterToJoin));
    }

    public static String joinStringsWithLetter(ArrayList<String> inputListofStrings, char inputLetterToJoin) {
        String StringJoinedWithLetter = "";

        for (int i = 0; i < inputListofStrings.size()-1; i++) {
            StringJoinedWithLetter += inputListofStrings.get(i) + inputLetterToJoin;
        }

        StringJoinedWithLetter += inputListofStrings.get(inputListofStrings.size()-1);

        return StringJoinedWithLetter;
    }
}
