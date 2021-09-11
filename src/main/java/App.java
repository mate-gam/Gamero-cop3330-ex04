/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.io.Console;

public class App
{
    public static void main (String[] args)
    {
        Console con = System.console();
        String noun = con.readLine("Enter a noun: ");
        String mes;
        String verb = con.readLine("Enter a verb: ");
        String adj = con.readLine("Enter an adjective: ");
        String ad = con.readLine("Enter an adverb: ");
        mes = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, ad);
        System.out.println(mes);
    }
}
