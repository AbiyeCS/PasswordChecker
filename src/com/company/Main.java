package com.company;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter in a password?");
        String password=sc.nextLine();

        if (upperCase(password) && lowerCase(password) && numberCase(password) && specialCase(password) && aboveFive(password))
        {
            System.out.println("Password accepted");
        }
        else{
            System.out.println("Wrong format, please try again");
        }

    }
    private static boolean upperCase(String str)
    {
        char ch;
        for(int i=0; i<str.length();i++)
        {
            ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                return true;
            }
        }

    return false;
    }
    private static boolean lowerCase(String str)
    {
        char ch;
        for(int i=0; i<str.length();i++)
        {
            ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                return true;
            }
        }

        return false;
    }
    private static boolean numberCase(String str)
    {
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                return true;
            }
        }

        return false;
    }
    private static boolean specialCase(String str)
    {
        char ch;
        char ph;
        String specialChars = "/*!@$^&*()\"{}_[]|\\?<>,."; // NOTE: you must escape the backslash and " characters with a backslash
         for(int i=0; i<str.length();i++)
        {
            ch=str.charAt(i);
            for (int j=0;j<specialChars.length();j++)
            {
                ph=specialChars.charAt(j);
                if (ch == ph)
                {
                    return true;
                }

            }
        }
        return false;
    }
    private static  boolean aboveFive(String str)
    {
        if (str.length()>=5){
            return true;
        }
        else{
            System.out.print("Password not above 20 characters");
        }

        return false;
    }
}
