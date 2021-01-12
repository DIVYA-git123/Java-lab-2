/* Question 1: Write a java class having overloaded methods to calculate area of a rectangle and circle  */
class methodoverload
{
    public static void main(String[] args)
    {
        Areas obj = new Areas();
        obj.Area(7);
        obj.Area(4,8);
    }
}
class Areas  // Class having overloaded mehods
{
    double A;
    void Area(double r)  // Method for area of circle
    {
        A = (r*r*22)/7;
        System.out.println("Area of the circle is "+A);
    }
    void Area(double l,double b)  // Method for area of rectangle
    {
        A = l*b;
        System.out.println("Area of the reactangle is "+A);
    }
}

/* OUTPUT
Area of the circle is 154.0
Area of the reactangle is 32.0

*/