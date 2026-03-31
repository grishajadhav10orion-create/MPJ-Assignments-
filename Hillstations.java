class Hillstations 
{
    void famousfor() 
    {
        System.out.println("Hillstations are famous for scenic beauty.");
    }

    void famousfood() 
    {
        System.out.println("Hillstations have unique local food.");
    }

    public static void main(String[] args) 
    {
        Hillstations h;

        
        h = new Manali();
        h.famousfor();
        h.famousfood();

        System.out.println();

        
        h = new Mussoorie();
        h.famousfor();
        h.famousfood();

        System.out.println();


        h = new Mahabaleshwar();
        h.famousfor();
        h.famousfood();
    }
}

class Manali extends Hillstations 
{
    void famousfor() 
    {
        System.out.println("Manali is famous for snow and mountains.");
    }

    void famousfood() 
    {
        System.out.println("Manali is famous for Siddu.");
    }
}

class Mussoorie extends Hillstations 
{
    void famousfor() 
    {
        System.out.println("Mussoorie is famous for waterfalls and hills.");
    }

    void famousfood() 
    {
        System.out.println("Mussoorie is famous for Momos.");
    }
}

class Mahabaleshwar extends Hillstations 
{
    void famousfor() 
    {
        System.out.println("Mahabaleshwar is famous for strawberries.");
    }

    void famousfood() 
    {
        System.out.println("Mahabaleshwar is famous for corn and berries.");
    }
}