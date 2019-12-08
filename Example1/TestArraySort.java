package testarraysort;
import sort.*;
import java.util.*;

public class TestArraySort 
{
    static void assignValue(Double[] array)
    {
	var rand = new Random();
	for(int i = 0, len = array.length; i != len; ++i)
            array[i] = (double)rand.nextInt(1000);
    }
    
    public static void main(String[] args) 
    {
        var sc = new Scanner(System.in);
	var array = new Double[1000];
	var sort = new SArray<Double>(array);

	assignValue(array);
	sort.bubble(new SortUpward());
	sort.printArray();
	System.out.println("End Bubble Sort");
	sc.nextLine();
		
	assignValue(array);
	sort.selection(new SortFalling());
	sort.printArray();
	System.out.println("End Selection Sort");
	sc.nextLine();
		
	assignValue(array);
	sort.insertion(new SortFalling());
	sort.printArray();
	System.out.println("End Insertion Sort");
		
	sc.nextLine();
	assignValue(array);
	sort.shell(new SortUpward());
	sort.printArray();
	System.out.println("End Shell Sort");
    }
    
}
