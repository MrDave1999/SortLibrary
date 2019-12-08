package testlistsort;
import java.util.Random;

class Person
{
    public String name;
    public String card;
    public int age;
    public float height;
	
    public Person()
    {
	var rand = new Random();
	this.name = "David";
	this.card = "0923611701";
	this.age = rand.nextInt(1000);
	this.height = 1.73f;
    }
}
