package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

//    private List<_> sortedList = (List<_>) new Group<>();
    private List<_> sortedList;
    public SortedGroup(){
        this.sortedList = new ArrayList<>();
    }
    @Override
    public void insert(Object value) {
        sortedList.add((_)value);
    }

    @Override
    public void delete(Object value) {
        sortedList.remove((_)value);
    }

    public Integer indexOf(_ value) {
        return sortedList.indexOf(value);
    }
}
