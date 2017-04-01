package ca.bcit.comp2526.a3.doublyLinkedList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Linked list using Collection interface.
 * @author Philip Choi
 * @version 1.0
 * @param <E> Generic type
 */
public class LinkedList<E> implements Collection<E> {

    /**
     * Head of the linked list.
     */
    private Node head;
    
    /**
     * Tail of the linked list.
     */
    private Node tail;
    
    /**
     * Size of the linked list.
     */
    private int size;
    
    /**
     * Node class.
     * @author Philip Choi
     * @version 1.0
     */
    class Node {
        /**
         * Next node.
         */
        private Node next;
        
        /**
         * Previous node.
         */
        private Node prev;
        
        /**
         * Data for the node.
         */
        private E data;
        
        /**
         * Node constructor for linked list.
         * @param next next node
         * @param prev previous node
         * @param data data for the node
         */
        public Node(Node prev, Node next, E data) {
            this.prev = prev;
            this.next = next;
            this.data = data;
        }
        
        /**
         * Get data from the node.
         * @return data
         *          data that is inside the node
         */
        public E getData() {
            return data;
        }
    }
    
    /**
     * Constructor with first data given.
     * @param e
     *       Data
     */
    public LinkedList(E e) {
        add(e);
    }
    
    /**
     * Empty linked list.
     */
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * Size of the linked list.
     * @return size
     *          size of the linked list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks if the list is empty.
     * @return true if the list is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    /**
     * Check if the list contains the passed in value.
     * @param ob
     *        value to find in the list
     */
    @Override
    public boolean contains(Object ob) {
        if (head == null) {
            return false;
        } else if (tail != null) {
            Node curr = head;
            while (curr != null) {
                if (curr.data == (E) ob) {
                    return true;
                }
                curr = curr.next;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<E>() {
            /**
             * Next index of the list.
             */
            private int nextIdx = 0;
            
            /**
             * Previous index of the list.
             */
            private int prevIdx = -1;
            
            /**
             * Current Node.
             */
            private Node curr = null;
            
            @Override
            public boolean hasNext() {
                return curr != tail;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (curr == null) {
                    curr = head;
                    nextIdx++;
                    prevIdx++;
                    return curr.data;
                }
                curr = curr.next;
                nextIdx++;
                prevIdx++;
                return curr.data;
            }

            @Override
            public boolean hasPrevious() {
                return curr != head;
            }

            @Override
            public E previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                if (nextIdx == size()) {
                    nextIdx--;
                    prevIdx--;
                    return tail.data;
                }
                curr = curr.prev;
                nextIdx--;
                prevIdx--;
                return curr.data;
            }

            @Override
            public int nextIndex() {
                // TODO Auto-generated method stub
                return nextIdx;
            }

            @Override
            public int previousIndex() {
                // TODO Auto-generated method stub
                return prevIdx;
            }

            @Override
            public void remove() {
                throw new NoSuchElementException();
                
            }

            @Override
            public void set(E e) {
                throw new NoSuchElementException();
                
            }

            @Override
            public void add(E e) {
                throw new NoSuchElementException();
                
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        if (head == null) {
            return null;
        } else {
            Node curr = head;
            for (int i = 0; i < size; i++) {
                array[i] = curr.data;
                curr = curr.next;
            }
            return array;
        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size ) {
            a = Arrays.copyOf(a, size);
            Node curr = head;
            for (int i = 0; i < a.length; i++) {
                if (curr != null) {
                    a[i] = (T) curr.data;
                    curr = curr.next;
                } 
            }
        } else {
            Node curr = head;
            for (int i = 0; i < a.length; i++) {
                if (curr != null) {
                    a[i] = (T) curr.data;
                    curr = curr.next;
                } else {
                    a[i] = null;
                }
            }
        }
        return a;
    }

    @Override
    public boolean add(E el) {
        Node tmp = new Node(tail, null, el);
        if (head == null) {
            head = tail = tmp;
            size++;
            return true;
        } else if (tail != null) {
            tail.next = tmp;
            tail = tmp;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if (isEmpty()) {
            return false;
        } else {
            Node curr = head;
            while (curr != null) {
                if (curr == head) {
                    if (curr.data.equals(o)) {
                        head = head.next;
                        size--;
                        break;
                    }
                } else if (curr != tail) {
                    if (curr.data.equals(o)) {
                        curr.prev.next = curr.next;
                        curr.next.prev = curr.prev;
                        size--;
                        break;
                    }
                } else if (curr == tail) {
                    if (curr.data.equals(o)) {
                        tail = tail.prev;
                        curr.prev.next = null;
                        size--;
                        break;
                    }
                }
                curr = curr.next;
            }
            return true;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (isEmpty()) {
            return false;
        } else {
            for (Object o : c) {
                if (!this.contains(o)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (Object o : c) {
            add((E) o);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (isEmpty()) {
            return false;
        } else {
            for (Object o : c) {
                while (contains(o)) {
                    remove(o);
                }
            }
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if (isEmpty()) {
            return false;
        }
        Node curr = head;
        while (curr != null) {
            if (!c.contains(curr.data)) {
                remove(curr.data);
            }
            curr = curr.next;
        }
        return false;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }
}
