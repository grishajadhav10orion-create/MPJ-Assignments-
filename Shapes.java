class Shapes 
{
    double area;
    Shapes()
    {
        //default constructor
    }
    Shapes(double side)
    {
        area = side*side;
        System.out.println("Area of Square: "+area);
    }

    Shapes(double length, double breadth)
    {
        area = length* breadth;
        System.out.println("Area of Rectangle: "+area);
    }
    
    Shapes(double radius, boolean isCircle)
    {
        area = Math.PI *radius *radius;
        System.out.println("Area of Cirlcle: "+area);

    }

    void calculateArea(int side) 
    {
        System.out.println("Area of Square: " + (side * side));
    }

    void calculateArea(int length, int breadth) 
    {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void calculateArea(double radius) 
    {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    public static void main(String args[])
    {
        //constructor overloading
        Shapes s1 = new Shapes(5);
        Shapes s2 = new Shapes(4,6);
        Shapes s3 = new Shapes(7,true);

        System.out.println();

        //method overloading
        Shapes obj = new Shapes();
        obj.calculateArea(7);
        obj.calculateArea(6, 7);
        obj.calculateArea(3.5);
    }
}