// UC1- Valid First Name & First name starts with Cap and has minimum 3 characters
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions
{
    static Pattern pattern = Pattern.compile("^([A-Z]{1}[a-z]{3,})$");
    public static void main(String[] args)
    {
        Matcher matcher = pattern.matcher("Panchal");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
