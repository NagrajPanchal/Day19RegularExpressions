// UC6 - Validate Pre-defined Password rules. Rule3– Should have at least 1 Upper Case
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions
{
    static Pattern pattern = Pattern.compile("^(?=.*?[a-z])(?=.*?[A-Z]).{8,}$");
    public static void main(String[] args)
    {
        Matcher matcher = pattern.matcher("NagrajPanchal");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
