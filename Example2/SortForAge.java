package testlistsort;
import java.util.*;

class SortForAge implements Comparator<Person>
{
    @Override
    public int compare(Person per1, Person per2)
    {
	return per1.age - per2.age;
    }
}
