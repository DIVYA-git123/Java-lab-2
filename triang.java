 /* Question 3:Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
a class named 'Triangle' without any parameter in its constructor. */

class Triangle
{
 int a,b,c;
public double area(){
double s = (a+b+c)/2.0;
return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}
public double perimeter(){
return(a+b+c)/2.0;
}
}
class triang
{
 public static void main(String[]args){
Triangle t = new Triangle();
t.a=3;
t.b=4;
t.c=5;
System.out.println(t.area());
System.out.println(t.perimeter());
}
}

/* OUTPUT
6.0
6.0
*/