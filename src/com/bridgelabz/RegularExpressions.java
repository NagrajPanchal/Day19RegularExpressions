// UC4 - Validate Pre-defined Password rules. Rule1 – minimum 8 Characters
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions
{
    static Pattern pattern = Pattern.compile("^([a-z]{8,})$");
    public static void main(String[] args)
    {
        Matcher matcher = pattern.matcher("nagrajpanchal");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
