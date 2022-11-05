// UC4 - Validate Pre-defined Mobile Format Country code follow by space and 10digit number
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions
{
    static Pattern pattern = Pattern.compile("^([0-9]{2})\s([0-9]{10})$");
    public static void main(String[] args)
    {
        Matcher matcher = pattern.matcher("91 9739713842");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
