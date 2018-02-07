package com.bbd.pingpong;

import java.util.ArrayList;
import java.util.List;


public class RomanConverter {

    public static int Convert(String s) {
       // char first = s[0];
        s = s.toUpperCase();
       /* if (s == "V")
            return 5;
        if (s == "IV")
            return 4;
        if (s.charAt(0) == 'V')
        {
            return (s.length() - 1) + 5;
        }
        if (s == "IX")
            return 9;
        if (s.charAt(0) == 'X')
        {
            if (s.length() == 1)
                return 10;
            if (s == "XIV")
                return 14;
            if (s.charAt(1) == 'V')
                return (s.length() - 2) + 15;
            else if (s == "XIX")
                return 20;
            else if ((s.length() - 1) + 10 > 13)
                return -1;
            else
                return (s.length() - 1) + 10;
        }
        else
            return s.length();
        */
       if (s.contains("IIII") || s.contains("VIIII") || s.contains("XXXX") || s.contains("LXXXX") || s.contains("CCCC") || s.contains("DCCCC"))
       {
           throw new RuntimeException();
        //   return -1;
       }

       s = s.replaceAll("IV", "IIII");
       s = s.replaceAll("IX", "VIIII");
       s = s.replaceAll("XL", "XXXX");
       s = s.replaceAll("XC", "LXXXX");
       s = s.replaceAll("CD", "CCCC");
       s = s.replaceAll("CM", "DCCCC");
        int i = 0;
        int sum = 0;
        int value = 0;
        while(i < s.length()) {
            if (s.charAt(i) != 'I' && s.charAt(i) != 'V' && s.charAt(i) != 'X' && s.charAt(i) != 'C' && s.charAt(i) != 'D' && s.charAt(i) != 'L' && s.charAt(i) != 'M')
            {
                throw new RuntimeException();
            }
                //if(s.charAt(i) != null)
                //{
                if (s.charAt(i) == 'I')
                    sum += 1;
                if(s.charAt(i) == 'V')
                    sum += 5;
                if(s.charAt(i) == 'X')
                    sum += 10;
                if(s.charAt(i) == 'L')
                    sum += 50;
                if(s.charAt(i) == 'C')
                    sum += 100;
                if (s.charAt(i) == 'D')
                    sum += 500;
                if (s.charAt(i) == 'M')
                    sum += 1000;






            //}
            i++;
        }
        System.out.println(sum);

        return sum;

    }
}