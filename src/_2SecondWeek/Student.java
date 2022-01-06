package SecondWeek;

public class Student
{
    private String name;
    private int id;
    private int units;

    //default contructor
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
        this.units = 0;
    }
    //getters
    public String getName()
    {
        return this.name;
    }
    public int getID()
    {
        return this.id;
    }
    public int getUnits()
    {
        return  this.units;
    }

    //modifiers
    public void incrementUnits(int units)
    {
        this.units += units;
    }
    public Boolean hasEnoughUnits()
    {
        return (this.units == 180);
    }
    public String toString()
    {
        return getName() + " (#" + getID() + ")";
    }
}
