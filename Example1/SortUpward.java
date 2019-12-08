package testarraysort;
import java.util.*;

//Clase que implementa un método de comparación para ordenar de menor a mayor
class SortUpward implements Comparator<Double>
{
    @Override
    public int compare(Double a, Double b)
    {
	return (int)(a-b);
    }
}
