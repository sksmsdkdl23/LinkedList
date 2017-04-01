/**
 * 
 */
package ca.bcit.comp2526.a3.doublyLinkedList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Tooru
 *
 */
public class LinkedListTest {

    private LinkedList<String> stringList;
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        stringList = new LinkedList<String>();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        stringList = null;
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#LinkedList(java.lang.Object)}.
     */
    @Test
    public void testLinkedListE() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#LinkedList()}.
     */
    @Test
    public void testLinkedList() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#size()}.
     */
    @Test
    public void testSize() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#isEmpty()}.
     */
    @Test
    public void testIsEmpty() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#contains(java.lang.Object)}.
     */
    @Test
    public void testContains() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#iterator()}.
     */
    @Test
    public void testIterator() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#toArray()}.
     */
    @Test
    public void testToArray() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#toArray(T[])}.
     */
    @Test
    public void testToArrayTArray() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#add(java.lang.Object)}.
     */
    @Test
    public void testAddOneNodeToEmptyList() {
        stringList.add("Pashan");
        assertEquals(stringList.size(), 1);
        assertNotNull(stringList.getHead());
        assertNotNull(stringList.getTail());
        assertEquals(stringList.getHead(), stringList.getTail());
        assertTrue(stringList.getHead().getData().equals("Pashan"));
        assertTrue(stringList.getTail().getData().equals("Pashan"));
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#remove(java.lang.Object)}.
     */
    @Test
    public void testRemove() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#containsAll(java.util.Collection)}.
     */
    @Test
    public void testContainsAll() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#addAll(java.util.Collection)}.
     */
    @Test
    public void testAddAll() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#removeAll(java.util.Collection)}.
     */
    @Test
    public void testRemoveAll() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#retainAll(java.util.Collection)}.
     */
    @Test
    public void testRetainAll() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link ca.bcit.comp2526.a3.doublyLinkedList.LinkedList#clear()}.
     */
    @Test
    public void testClear() {
        fail("Not yet implemented");
    }

}
