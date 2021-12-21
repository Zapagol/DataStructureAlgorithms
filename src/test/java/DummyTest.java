import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DummyTest {
    public static void main(String[] args) {

        String input = "welcometojava".toLowerCase();
        //input.toCharArray();
        lowestHighest2(input);
        palindrome("madam");
        token("He is a very very good boy, isn't he?");

    }

    static void lowestHighest(String input){
        String[] stringArray = new String[input.length() - 2];
        int count = 3;
        int initial = 0;
        String subString;
        while (count <= input.length()){
            subString = input.substring(initial, count);
            stringArray[initial] = subString;
            initial++;
            count++;
        }

        Arrays.sort(stringArray);
        System.out.println(stringArray[0] + " " + stringArray[stringArray.length - 1]);
    }

    static void lowestHighest2(String input){
        String lowest = "";
        String highest = "";
        int count = 3;
        int initial = 0;
        String subString;
        while (count <= input.length()){
            subString = input.substring(initial, count);
            if(initial == 0){
                lowest = subString;
                highest = subString;
            }else{
                int lowestValue = lowest.compareTo(subString);
                int highestValue = highest.compareTo(subString);
                if(lowestValue > 0){
                    lowest = subString;
                }
                if(highestValue < 0){
                    highest = subString;
                }
            }
            initial++;
            count++;
        }

        System.out.println(lowest + " " + highest);
    }

    static void palindrome(String input){
        String reverse = "";
        char[] charArray = input.toCharArray();
        for(int i = charArray.length - 1; i >= 0; i--){
            reverse += charArray[i];
        }
        if(input.equals(reverse)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    static void token(String input){
        //String regex = "\"[\\\\s]\"";

        String delims = "[ .,?!]+";
        String[] tokens = input.split(delims);
        System.out.println(Arrays.toString(tokens));
    }
}
