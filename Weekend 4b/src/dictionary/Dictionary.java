package dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    Map<String, String> mapa = new HashMap<>();

    public void newEntry(String key, String value) {
        mapa.put(key, value);
    }

    public String look(String s){
        return mapa.getOrDefault(s,"Cant find entry for "+s);
    }
}

/*
In this kata, your job is to create a class Dictionary which you can add words to and their entries. Example:

        Dictionary d = new Dictionary();

        d.newEntry("Apple", "A fruit that grows on trees");

        System.out.println(d.look("Apple"));
        >>> A fruit that grows on trees

        System.out.println(d.look("Banana"));
        >>> Cant find entry for Banana*/
