package Collections_HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_HW {
    public List_HW(){
    List<String> list = new ArrayList<>();
     list.add("yes");
     list.add("no");
     list.add("maybe");
     iterate(list);
        System.out.println(list);
    }
    public void iterate(List<String > list){
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String string = itr.next();
            if (string.length() < 3) {
                itr.remove();
            }
        }
    }
    public static void main(String[] args) {
        List_HW list = new List_HW();
    }
}
