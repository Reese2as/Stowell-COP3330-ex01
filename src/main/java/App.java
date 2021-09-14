/*
UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Reese Stowell
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args)
{
 Scanner user_input = new Scanner(System.in);
 String name;
 System.out.print("What is your name?");
 name = user_input.next();
 System.out.println(String.format("Hello, %s, nice to meet you!",name));
}
}
