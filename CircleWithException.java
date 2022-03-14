package lab;

import java.util.Scanner;

public class CircleWithException {
    private static int radius;
    private static int diameter;
    private static int area;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int radius) {
        this.diameter = radius * 2;
    }

    public static int getArea() {
        return area;
    }

    public static void setArea(int radius) {
        area = (int) (Math.PI * Math.pow(radius, 2));
    }

    public static int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void checkvalue(int area, int radius) throws Exception, IllegalArgumentException {
        if (radius < 0) throw new IllegalArgumentException("radius is negative");
        else if (area > 1000) throw new Exception("area is more than 1000");
    }

    public static void main(String[] args) {
        try
        {
            System.out.print("Enter radius of circle: ");
            Scanner sn = new Scanner(System.in);
            int radius = sn.nextInt();
            setArea(radius);
            checkvalue(getArea(), radius);
            System.out.println(getArea());
        }
        catch ( Exception e)
        {
            System.out.println("Caught: " + e);
        }

    }
}
