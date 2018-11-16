public abstract class Mustang implements Horse
{
    private int weight;
    private String name;
    public Mustang(int weight, String name)
    {
        this.weight = weight;
        this.name = name;
    }
    public int getWeight() {return weight;}
    public String getName() {return name;}
}
