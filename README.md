# SortLibrary
[![SortLibrary](https://shields.southcla.ws/badge/SortLibrary-v1.0-2f2f2f.svg?style=flat-square)](https://github.com/MrDave1999/SortLibrary)
[![SortLibrary](https://shields.southcla.ws/badge/Java-SortingMethods-2f2f2f.svg?style=flat-square)](https://github.com/MrDave1999/SortLibrary)
[![SortLibrary](https://shields.southcla.ws/badge/JDK13-NetBeans-2f2f2f.svg?style=flat-square)](https://github.com/MrDave1999/SortLibrary)

Esta biblioteca de clases proporciona métodos para ordenar listas de objetos o arreglos.

## Instalación

Para poder usar algún método de la clase `SArray` o `SList`, necesitarás importar la clase en tu proyecto de esta forma:
```Java
import sort.SArray;
import sort.SList;
```
La segunda opción sería:
```Java
import sort.*; //Importa ambas clases que estén en el paquete sort.
```

## Clases

- `SArray`: Proporciona métodos de ordenamiento para ordenar un arreglo de objetos.
- `SList`: Proporciona métodos de ordenamineto para ordenar una lista de objetos.

## Métodos

- `bubble`: Ordena objetos mediante el método de burbuja.
- `selection`: Ordena objetos mediante el método de seleción.
- `insertion`: Ordena objetos mediante el método de inserción.
- `shell`: Ordena objetos mediante el método de shell (se denomina Shell en honor de su inventor Donald Shell).

Los 4 métodos tienen como parámetro: `Comparator<T> cmp`. Básicamente el parámetro `cmp` recibe un objeto que implemente el método `compare` de la interfaz `Comparator`.

## Uso

**1. Example:**

En el siguiente ejemplo se muestra la forma como se debería usar la clase `SArray`.
```Java
import sort.SArray;
import java.util.*;

class SortForName implements Comparator<String>
{
    @Override
    public int compare(String s1, String s2)
    {
        return s1.compareTo(s2);
    }
}

public class TestArraySort
{  
    public static void main(String[] args) 
    {
        String[] name = {"David","Joel","Maria","Placencio","Guillermo"};
        var a = new SArray<String>(name);
        a.shell(new SortForName());
        for(String nam : name)
            System.out.println(nam);
    }
}
```
Salida por pantalla:
```
David
Guillermo
Joel
Maria
Placencio
```

**2. Example:**

En el siguiente ejemplo se muestra la forma como se debería usar la clase `SList`.
```Java
package testlistsort;
import java.util.*;
import sort.SList;

class SortForName implements Comparator<String>
{
    @Override
    public int compare(String s1, String s2)
    {
        return s1.compareTo(s2);
    }
}

public class TestListSort 
{
    public static void main(String[] args) 
    {
        var list = new ArrayList<String>();
        var sort = new SList<String>(list);
	
        list.add("David");
        list.add("Joel");
	      list.add("Maria");
        list.add("Placencio");
        list.add("Guillermo");
        list.add("Guillermo");
        
        sort.bubble(new SortForName());
        for(String nam : list)
            System.out.println(nam);
    }
}
```
Salida por pantalla:
```
David
Guillermo
Guillermo
Joel
Maria
Placencio
```

## Créditos

- [MrDave](https://github.com/MrDave1999)

- [Oracle](https://github.com/oracle)
