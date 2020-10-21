import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * WoordNaam is an Object Class designed to create an empty map with two integer keys (0 and 1)
 * the values are empty Woord-LinkedLists
 */
public class WoordNaam {

     Map<Integer, List<Woord>> objMapWithObjListValues;

    /**
     * Constructor creates a HashMap to hold integer keys and WoordList values.
     * create per entry an empty Woordlist to hold future Woord objects
     */
    public WoordNaam() {

        this.objMapWithObjListValues = new HashMap<Integer, List<Woord>>();
        this.objMapWithObjListValues.put(0, new LinkedList<Woord>());
        this.objMapWithObjListValues.put(1, new LinkedList<Woord>());

        System.out.println("ctor Woordnaam" + objMapWithObjListValues);
    }

    public Map<Integer, List<Woord>> getObjMapWithObjListValues() {
        return objMapWithObjListValues;
    }


    /**
     * iterate over HashMap entries and collect all entries in a StringBuilder
     * @return entries collection as a string
     */
    @Override
    public String toString() {

        StringBuilder zin = new StringBuilder();

        objMapWithObjListValues.entrySet().stream().forEach(e -> zin.append("\n" + e));

        return zin.toString();

    }
}
