import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>(Arrays.asList("ab", "cde", "fg"));
        char letterToJoin = 'a';

        System.out.println(joinStringsWithLetter(listOfStrings, letterToJoin));

    }

    public static String joinStringsWithLetter(ArrayList<String> inputListofStrings, char letterToJoin) {
        String StringJoinedWithLetter = "";

        for (int i = 0; i < inputListofStrings.size()-1; i++) {
            StringJoinedWithLetter += inputListofStrings.get(i) + letterToJoin;
        }

        StringJoinedWithLetter += inputListofStrings.get(inputListofStrings.size()-1);

        return StringJoinedWithLetter;
    }
}
