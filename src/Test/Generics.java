package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class Generics<TYPE>
{
    TYPE item;
    Map<TYPE,String> typeStringMap = Collections.EMPTY_MAP;

    public abstract void processRequest(TYPE value);

    public TYPE getItem()
    {
        return item;
    }

    public void addItem(TYPE value)
    {
        typeStringMap.put( value, "" );
        System.out.println("value inside the map--->"+typeStringMap);
    }
}
