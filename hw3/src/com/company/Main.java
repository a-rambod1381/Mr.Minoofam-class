package com.company;
import java.util.Scanner;
public class Main
{

<<<<<<< HEAD
    public static class dastgah_moadele
    {
        float a,b,c,d,e,f;
        float x,y;
        public void hal_dastgah()
        {
            if((a == 0 && b == 0) || (c == 0 && d == 0))
            {
                System.out.println("dastgah javab nadarad");
            }
            else if(a / b == c / d)
            {
                System.out.println("dastgah javab nadarad");
            }
            else
            {
                x = ((e * d) - (b * f))/((a * d) - (b * c));
                y = ((a * f) - (e * c))/((a * d) - (b * c));
                System.out.println("x is:"+ x + "and y is" + y);
            }
=======
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
>>>>>>> b033f9ad4f11f7a22887ce1a0a71c36fbbd4e868
        }
    }
    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);
<<<<<<< HEAD

        dastgah_moadele dastgah = new dastgah_moadele();
        System.out.println("a , b , e ra vared konid");
        dastgah.a = sc.nextFloat();
        dastgah.b = sc.nextFloat();
        dastgah.e = sc.nextFloat();
        System.out.println("c , d , f ra vared konid");
        dastgah.c = sc.nextFloat();
        dastgah.d = sc.nextFloat();
        dastgah.f = sc.nextFloat();
        dastgah.hal_dastgah();
=======
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
>>>>>>> b033f9ad4f11f7a22887ce1a0a71c36fbbd4e868
    }
}
