// This program converts an integer to a Roman numeral.
// Time complexity: O(1)
// Space complexity: O(1)
class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        
        // Append "M" for each 1000 in the number
        if(num / 1000 > 0){
            for(int i = 0; i < num/1000; i++){
                sb.append("M");
            }
            num %= 1000;
        }

        // Append "CM" for each 900 in the number
        if(num / 900 > 0){
            for(int i = 0; i < num/900; i++){
                sb.append("CM");
            }
            num %= 900;
        }

        // Append "D" for each 500 in the number
        if(num / 500 > 0){
            for(int i = 0; i < num/500; i++){
                sb.append("D");
            }
            num %= 500;
        }

        // Append "CD" for each 400 in the number
        if(num / 400 > 0){
            for(int i = 0; i < num/400; i++){
                sb.append("CD");
            }
            num %= 400;
        }

        // Append "C" for each 100 in the number
        if(num / 100 > 0){
            for(int i = 0; i < num/100; i++){
                sb.append("C");
            }
            num %= 100;
        }

        // Append "XC" for each 90 in the number
        if(num / 90 > 0){
            for(int i = 0; i < num/90; i++){
                sb.append("XC");
            }
            num %= 90;
        }

        // Append "L" for each 50 in the number
        if(num / 50 > 0){
            for(int i = 0; i < num/50; i++){
                sb.append("L");
            }
            num %= 50;
        }

        // Append "XL" for each 40 in the number
        if(num / 40 > 0){
            for(int i = 0; i < num/40; i++){
                sb.append("XL");
            }
            num %= 40;
        }

        // Append "X" for each 10 in the number
        if(num / 10 > 0){
            for(int i = 0; i < num/10; i++){
                sb.append("X");
            }
            num %= 10;
        }

        // Append "IX" for each 9 in the number
        if(num / 9 > 0){
            for(int i = 0; i < num/9; i++){
                sb.append("IX");
            }
            num %= 9;
        }

        // Append "V" for each 5 in the number
        if(num / 5 > 0){
            for(int i = 0; i < num/5; i++){
                sb.append("V");
            }
            num %= 5;
        }

        // Append "IV" for each 4 in the number
        if(num / 4 > 0){
            for(int i = 0; i < num/4; i++){
                sb.append("IV");
            }
            num %= 4;
        }

        // Append "I" for each remaining 1 in the number
        while(num > 0){
            sb.append("I");
            num--;
        }

        return sb.toString();
    }
}
