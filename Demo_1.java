class IntegertoRoman{
    public String intToRoman(int num) { // 55 - DLV
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder(); // MMMMMD
        for(int i=0;i<values.length && num > 0;i++){
            while(num >= values[i]){
                result.append(romans[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }
}


public class Demo_1{
    public static void main(String[] args) {
        IntegertoRoman obj = new IntegertoRoman();
        String output = obj.intToRoman(97);
        System.out.println(output);// 97 - XCVII
    }
}