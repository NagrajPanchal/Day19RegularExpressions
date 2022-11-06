// UC8 - Validate Pre-defined Password rules. Rule4– Has exactly 1 Special Character
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions
{
    static Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[.,:;'!@#$%^&*_+=|(){}?\\-\\\\/\\\\]{1}).{8,}$");
    public static void main(String[] args)
    {
        Matcher matcher = pattern.matcher("NagrajPanchal123@#");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}