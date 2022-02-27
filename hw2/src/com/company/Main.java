package com.company;
import java.util.Scanner;
public class Main
{

    public static class studentScores
    {
        float math;
        float math_multiplier;
        float science;
        float science_multiplier;
        float history;
        float history_multiplier;
        float english;
        float english_multiplier;
        float avg;
        public void avgcal()
        {
            System.out.println("your average is:");
            avg = ((math * math_multiplier) + (science * science_multiplier) + (history * history_multiplier) + (english * english_multiplier))/(math_multiplier+science_multiplier+history_multiplier+english_multiplier);
        }
    }
    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);
        studentScores scores = new studentScores();
        System.out.println("enter math score and multiplier:");
        scores.math = sc.nextFloat();
        scores.math_multiplier = sc.nextFloat();
        System.out.println("enter science score and multiplier:");
        scores.science = sc.nextFloat();
        scores.science_multiplier = sc.nextFloat();
        System.out.println("enter history score and multiplier:");
        scores.history = sc.nextFloat();
        scores.history_multiplier = sc.nextFloat();
        System.out.println("enter english score and multiplier:");
        scores.english = sc.nextFloat();
        scores.english_multiplier = sc.nextFloat();
        scores.avgcal();
        System.out.println(scores.avg);
    }
}
