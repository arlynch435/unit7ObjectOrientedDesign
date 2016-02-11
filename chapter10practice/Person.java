
public class Person implements Comparable<Person>
{
    private String name;

    /**
     * Default constructor for objects of class Person
     */
    public Person(String n)
    {
        this.name=n;
    }
    public Person()
    {
        this.name="John Doe";
    }
    public String getName()
    {
        return this.name;
    }

    public int compareTo(Person other)
    {
        return this.name.compareTo(other.getName());
    }
    public String toString()
    {
        return "name: "+this.name;
    }

}
