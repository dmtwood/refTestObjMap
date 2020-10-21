import java.util.List;
import java.util.Map;



public class Main {



    public static void main(String[] args) {

        /**
         * create a map with two entries (0 and 1) with empty WoordLists as values
         */
        WoordNaam woordNaamMap = new WoordNaam();

        Woord testwoord = new Woord("testwoord");

        /**
         * add testwoord to the refenced empty WoordList of the first entry
         */
        woordNaamMap.getObjMapWithObjListValues().get(0).add(testwoord);


        /**
         * reference the empty WoordList of the second entry to a WoordList named testList
         * reference is achieved by not using new (I think)
         */
        List<Woord> testList = woordNaamMap.getObjMapWithObjListValues().get(1);


        /**
         * add Woord-objects to the referenced Woord-List
         * changes to this list also happen in the referenced Map, i.c. value of the second entry
         */

        testList.add(testwoord);
        testList.add(new Woord("test2"));



        System.out.println("map = " + woordNaamMap.toString());
        System.out.println("testlist = " + testList);


    }
}
