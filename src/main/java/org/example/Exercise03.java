/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;

class Quote
{
    String line;
    String speaker;
}

public class Exercise03
{
    public static void main( String[] args )
    {
        Quote q = new Quote();
        q = inputs(q);
        System.out.println(q.speaker + " says, \"" + q.line + ".\"");
    }

    public static Quote inputs(Quote q)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "What is the quote?" );
        q.line = sc.nextLine();
        System.out.println( "Who said it?" );
        q.speaker = sc.nextLine();
        return q;
    }
}
