package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable  {

    private Stack<SomeType> stack = new Stack<SomeType>();



    public MyStack() {
//        this.stack = new MyStack<>();
//        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {

        return stack.isEmpty();
    }

    public void push(SomeType i) {

        stack.push(i);
    }

    public SomeType peek() {
          return  stack.peek();
//        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public SomeType pop() {
//        if (!isEmpty()) {
//            return stack.pop();
//        }
//        throw new UnsupportedOperationException("Stack is empty");
        return stack.pop();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
