// UC9 - Should clear all E-mail samples provided separately
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions
{
    static Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
    public static void main(String[] args)
    {
        Matcher matcher = pattern.matcher("NagrajPanchal@gmail.com");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}