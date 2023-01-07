public  abstract class person
{
    private String name;
    public person(){}
    public person(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public abstract void display();

}