package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements GroupInterface {

    private List<_> groupList= new ArrayList();
    public Group() {


//        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {


        return groupList.size();
    }

    @Override
    public Boolean has(Object valueToInsert) {
        return groupList.contains(valueToInsert);
    }

    public _ fetch(int indexOfValue) {
        return groupList.get(indexOfValue);
    }

    @Override
    public void insert(Object string) {
        groupList.add((_)string);
    }


    @Override
    public void delete(Object valueToInsert) {
            groupList.remove(valueToInsert);
    }

    public void clear() {
        groupList.clear();
    }

    public Iterator<_> iterator() {

        return groupList.stream().iterator();
    }

    @Override
    public String toString() {
        return ""+ groupList + "";

    }

    @Override
    public void forEach(Consumer action) {
        GroupInterface.super.forEach(action);
    }
}
