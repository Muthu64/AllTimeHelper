package com.test.string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringImmutable
{
    public static void main( String[] args )
    {
        /*String s = new String( "Google" );
        String s1 = new String ("Google");

        System.out.println(s == s1);

        System.out.println(s.equals( s1 ));*/


       /* String stringLiteral = "Google";
        String stringLiteral2 = "Google";

        stringLiteral2 = "King";

        System.out.println(stringLiteral == stringLiteral2);

        System.out.println(stringLiteral.equals( stringLiteral2 ));
*/

   /*     Map<String,Integer> stringMap = new HashMap<>(  );

        String stringLiteral = "Google";

        stringMap.put(stringLiteral, 1);

        stringLiteral = "King";
        stringMap.put(stringLiteral, 2);

        System.out.println(stringMap);

        ArrayList<String> stringArrayList = new ArrayList<>(  );

        String testArrayListInputString = new String( "Google");
        stringArrayList.add( testArrayListInputString );
         testArrayListInputString = "Modified STring";
        stringArrayList.add( testArrayListInputString );
        System.out.println(stringArrayList);

*/

        HashSet<Integer> hashSet = new HashSet<Integer>();

        hashSet.add( 1 );
        hashSet.add( 2 );
                hashSet.add( 3 );

                hashSet.add( null );
        System.out.println(hashSet);

    }

}
