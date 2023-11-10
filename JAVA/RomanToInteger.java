//Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInt(romanNumeral);

        if (result != -1) 
        {
            System.out.println("The integer representation of " + romanNumeral + " is: " + result);
        } else 
        {
            System.out.println("Invalid Roman numeral.");
        }
    }

    public static int romanToInt(String s) 
    {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) 
        {
            int currentValue = romanMap.getOrDefault(s.charAt(i), -1);

            if (currentValue == -1) 
            {
                return -1; 
            }

            if (currentValue < prevValue)
             {
                result -= currentValue;
             } else 
             {
                result += currentValue;
             }

            prevValue = currentValue;
         }

        return result;
    }
}

