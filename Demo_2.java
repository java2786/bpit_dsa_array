import java.util.HashMap;
import java.util.Map;

class RomanToInteger{
    public int romanToInt(String s) { // XIV
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
            
        int result = 0;
        int i=0;
        while(i<s.length()){
            int currentVal = map.get(s.charAt(i));

            int nextVal = 0;
            if(i+1<s.length()){
                nextVal = map.get(s.charAt(i+1));
            }

            if(nextVal > currentVal){
                result += (nextVal - currentVal);
                i = i+2;
            } else {
                result += currentVal;
                i++;
            }
        }

        return result;
    }
}

public class Demo_2 {
    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        int n = obj.romanToInt("XCVII");// 97
        System.out.println(n);
    }
}
