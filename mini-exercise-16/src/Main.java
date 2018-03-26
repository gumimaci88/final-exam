import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>(Arrays.asList("ab", "cde", "fg"));
        char letterToJoin = ' ';

        System.out.println(joinStringsWithLetter(listOfStrings, letterToJoin));

    }

    public static String joinStringsWithLetter(ArrayList<String> inputListofStrings, char letterToJoin) {
        String StringJoinedWithLetter = "";

        for (int i = 0; i < inputListofStrings.size(); i++) {
            StringJoinedWithLetter += inputListofStrings.get(i) + letterToJoin;
        }
        return StringJoinedWithLetter;
    }
}
