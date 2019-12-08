package testarraysort;
import java.util.*;

//Clase que implementa un método de comparación para ordenar de mayor a menor
class SortFalling implements Comparator<Double>
{
    @Override
    public int compare(Double a, Double b)
    {
	return (int)(b-a);
    }
}
