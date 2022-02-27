package com.company;
import java.util.Scanner;
public class Main
{

    public static class square
    {
        float width;
        float s;
        public void scal()
        {
            s = width * width;
        }
    }
    public static class rectangle
    {
        float width,height;
        float s;
        public void scal()
        {
            s = width * height;
        }
    }
    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);

        //square
        System.out.println("enter the square width:");
        square sq = new square();
        sq.width = sc.nextFloat();
        sq.scal();
        System.out.println("the surface area of the square is:" + sq.s);

        //rectangle
        System.out.println("enter the rectangle width and height:");
        rectangle rec = new rectangle();
        rec.width = sc.nextFloat();
        rec.height = sc.nextFloat();
        rec.scal();
        System.out.println("the surface of the rectangle is:" + rec.s);
    }
}
