import java.util.ArrayList;
abstract class Person
{
    private String name;
    private String adders;

    public Person(String name, String adders)
    {
        this.name = name;
        this.adders = adders;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAdders()
    {
        return adders;
    }

    public void setAdders(String adders)
    {
        this.adders = adders;
    }
    public abstract void displayInfo();
}

