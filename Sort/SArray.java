package sort;
import java.util.*;

public class SArray<T>
{
	private T aux;
	private final T[] array;
	
	public SArray(T[] array)
	{
		this.array = array;
	}
	
	public void printArray()
	{
		for(T value : array)
			System.out.println(value);
	}
	
	private void swap(int i, int j)
	{
		aux = array[j];
		array[j] = array[i];
		array[i] = aux;
	}
	
	public void shell(Comparator<T> cmp)
	{
		int i, len = array.length;
		boolean change = false;
		int jumps = len;
		while(true)
		{
			if(jumps != 1)
				jumps /= 2;
			if(jumps == 1)
				change = true; 
			for(i = 0; i + jumps < len; ++i)
			{		
				if(cmp.compare(array[i], array[i + jumps]) > 0)
				{
					swap(i, i + jumps);
					change = false;
				}			
			}
			if(change) break;
		}
	}
	
	public void insertion(Comparator<T> cmp)
	{
		int i, j, len = array.length;
		for(i = 1; i != len; ++i)
		{
			for(j = i - 1; j != -1; --j)
			{
				if(cmp.compare(array[j], array[j+1]) > 0)
					swap(j, j+1);
			}
		}
	}
	
	public void selection(Comparator<T> cmp)
	{
		int i = 0, j, min, len = array.length;
		boolean change = true;
		while(true)
		{
			min = i;
			change = true;
			for(j = i + 1; j != len; ++j)
			{
				if(cmp.compare(array[min], array[j]) > 0) 
					min = j;
				if(cmp.compare(array[j-1], array[j]) > 0) 
					change = false;
			}
			if(i != min)
				swap(min, i);
			++i;
			if(change) break;
		}
	}
	
	public void bubble(Comparator<T> cmp)
	{
		int i, len = array.length;
		boolean change = true;
		while(true)
		{
			for(i = 1; i != len; ++i)
			{	
				if(cmp.compare(array[i-1], array[i]) > 0)
				{
					swap(i-1, i);
					change = false;
				}	
			}
			if(change) break;
			change = true;
			--len;
		}
	}
}
