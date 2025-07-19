
import java.util.*;

public class classPractice1 {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Lokesh");
        list.add("Rakesh");
        list.add("Prawin");
        list.add("Madhan");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String name = itr.next();
            System.out.println("Hello " + name + "!");
        }
    }
}
