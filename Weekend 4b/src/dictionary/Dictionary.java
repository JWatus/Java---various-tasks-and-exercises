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
