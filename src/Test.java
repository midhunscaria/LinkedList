import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    LinkedList<String>placesToVisit= new LinkedList<String>();

    public Test() {
        placesToVisit.add("Kochi");
        placesToVisit.add("Bangalore");
        placesToVisit.add("Goa");
        placesToVisit.add("Rajasthan");
        placesToVisit.add("Tosh");

    }

    public static void main(String[] args) {
        Test test= new Test();
        printPlaces(test.placesToVisit);
        test.placesToVisit.add(2,"Chandigarh");
        printPlaces(test.placesToVisit);
        //System.out.println(test.placesToVisit.get(5));

}
public static void printPlaces(LinkedList<String>placesToVisit){
        Iterator<String>i=placesToVisit.iterator();
        while(i.hasNext()){
            System.out.println("Visiting "+i.next());
        }
    System.out.println("============================");

}
}
