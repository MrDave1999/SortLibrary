package sort;
import java.util.*;

public class SList<T>
{
	private T aux;
	private final List<T> list;
	
	public SList(List<T> list)
	{
		this.list = list;
	}
	
	private void swap(int i, int j)
	{
		aux = list.get(j);
		list.set(j, list.get(i));
		list.set(i, aux);
	}
	
	public void shell(Comparator<T> cmp)
	{
		int i, len = list.size();
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
				if(cmp.compare(list.get(i), list.get(i + jumps)) > 0)
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
		int i, j, len = list.size();
		for(i = 1; i != len; ++i)
		{
			for(j = i - 1; j != -1; --j)
			{
				if(cmp.compare(list.get(j), list.get(j+1)) > 0)
					swap(j, j+1);
			}
		}
	}
	
	public void selection(Comparator<T> cmp)
	{
		int i = 0, j, min, len = list.size();
		boolean change = true;
		while(true)
		{
			min = i;
			change = true;
			for(j = i + 1; j != len; ++j)
			{
				if(cmp.compare(list.get(min), list.get(j)) > 0) 
					min = j;
				if(cmp.compare(list.get(j-1), list.get(j)) > 0) 
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
		int i, len = list.size();
		boolean change = true;
		while(true)
		{
			for(i = 1; i != len; ++i)
			{	
				if(cmp.compare(list.get(i-1), list.get(i)) > 0)
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
