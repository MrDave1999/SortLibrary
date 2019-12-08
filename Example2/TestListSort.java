package testlistsort;
import java.util.*;
import sort.SList;

public class TestListSort 
{

    static List<Person> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
	
    static void assignValue()
    {
	for(int i = 0; i != 1000; ++i)
            list.add(new Person());
    }

    static void showResult(String str)
    {
	for(int i = 0; i != list.size(); ++i)
            System.out.println(list.get(i).age);
	System.out.println(str);
	sc.nextLine();
	list.clear();
    }
    
    public static void main(String[] args) 
    {
        var sort = new SList<Person>(list);
		
	assignValue();
	sort.bubble(new SortForAge());
	showResult("End Bubble Sort");
		
	assignValue();
	sort.selection(new SortForAge());
	showResult("End Selection Sort");
		
	assignValue();
	sort.insertion(new SortForAge());
	showResult("End Insertion Sort");
			
	assignValue();
	sort.shell(new SortForAge());
	showResult("End Shell Sort");
		
    }
}
