package dataStructures.hashTables;

import java.util.ArrayList;

public class Main {
    public static void main(String args[])
    {
        HashTables hasTable=new HashTables();
        hasTable.set("hello",123);
        hasTable.set("Amma",143);
        hasTable.set("Nanna",162);
        hasTable.print();
        System.out.println(hasTable.keys());


    }

}
