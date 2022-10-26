package Test;

import Main.exeption.IndexValidateException;
import Main.exeption.ItemNotFoundException;
import Main.exeption.ItemValidateException;
import Main.service.StringList;
import Main.service.StringListImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static Test.StringListImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    private final StringListImpl out = new StringListImpl();

    @Test
    void shouldAddAndReturnItemInMethodAdd() {
        out.clear();
        assertEquals(ITEM_1, out.add(ITEM_1));
        assertTrue(out.contains(ITEM_1));
        assertEquals(1, out.size());
    }

    @Test
    void shouldAddItemInRightOrderAndReturnItInMethodAddByIndex() {
        out.add(ITEM_1);
        out.add(ITEM_3);
        assertEquals(ITEM_2, out.add(INDEX_1, ITEM_2));
        assertEquals(INDEX_1, out.indexOf(ITEM_2));
        assertTrue(out.contains(ITEM_2));
        assertEquals(3, out.size());
    }

    @Test
    void shouldReturnCorrectValueInMethodSet() {
        out.add(ITEM_2);
        out.add(ITEM_3);
        assertEquals(ITEM_1, out.set(INDEX_0, ITEM_1));
        assertTrue(out.contains(ITEM_1));
        assertFalse(out.contains(ITEM_2));
        assertEquals(2, out.size());
    }

    @Test
    void shouldRemoveItemByNameAndReturnIt() {
        out.add(ITEM_1);
        out.add(ITEM_2);
        out.add(ITEM_3);

        assertEquals(ITEM_2, out.remove(ITEM_2));
        assertEquals(NEGATIVE_1, out.indexOf(ITEM_2));
        assertEquals(2, out.size());

        assertEquals(ITEM_3, out.remove(ITEM_3));
        assertEquals(NEGATIVE_1, out.indexOf(ITEM_3));
        assertEquals(1, out.size());
    }
    @Test
    void shouldThrowItemNotFoundExceptionInMethodRemove() {
        assertThrows(ItemNotFoundException.class, () -> out.remove(ITEM_2));
    }

    @Test
    void shouldRemoveItemByIndexAndReturnIt() {
        out.add(ITEM_1);
        out.add(ITEM_2);
        out.add(ITEM_3);

        assertEquals(ITEM_2, out.remove(INDEX_1));
        assertEquals(NEGATIVE_1, out.indexOf(ITEM_2));
        assertEquals(2, out.size());

        assertEquals(ITEM_3, out.remove(INDEX_1));
        assertEquals(NEGATIVE_1, out.indexOf(ITEM_3));
        assertEquals(1, out.size());
    }

    @Test
    void shouldReturnCorrectValueInMethodContains() {
        out.add(ITEM_1);
        out.add(ITEM_2);
        assertTrue(out.contains(ITEM_1));
        assertTrue(out.contains(ITEM_2));
        assertFalse(out.contains(ITEM_3));
    }

    @Test
    void shouldReturnCorrectValueInMethodIndexOf() {
        out.add(ITEM_1);
        out.add(ITEM_2);
        out.add(ITEM_1);
        assertEquals(0, out.indexOf(ITEM_1));
        assertEquals(1, out.indexOf(ITEM_2));
        assertEquals(NEGATIVE_1, out.indexOf(ITEM_3));
    }

    @Test
    void shouldThrowItemValidateExceptionInMethodIndexOf() {
        assertThrows(ItemValidateException.class, () -> out.indexOf(NULL_ITEM));
    }

    @Test
    void shouldReturnCorrectValueInMethodLastIndexOf() {
        out.add(ITEM_1);
        out.add(ITEM_2);
        out.add(ITEM_1);
        assertEquals(2, out.lastIndexOf(ITEM_1));
        assertEquals(1, out.lastIndexOf(ITEM_2));
        assertEquals(NEGATIVE_1, out.indexOf(ITEM_3));
    }

    @Test
    void shouldReturnCorrectItemInMethodGet() {
        out.add(ITEM_1);
        out.add(ITEM_2);

        boolean actual = out.get(0).equals(ITEM_1);
        assertTrue(actual);

        actual = out.get(1).equals(ITEM_2);
        assertTrue(actual);
    }

    @Test
    void shouldThrowIndexValidateExceptionInMethodGet() {
        assertThrows(IndexValidateException.class, () -> out.get(INDEX_4));
    }

    @Test
    void shouldReturnTrueInMethodTestEquals() {
        StringList otherStringList = new StringListImpl(3);
        otherStringList.add(ITEM_1);
        otherStringList.add(ITEM_2);
        otherStringList.add(ITEM_3);

        out.clear();
        out.add(ITEM_1);
        out.add(ITEM_2);
        out.add(ITEM_3);

        boolean actual = out.equals(otherStringList);

        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseInMethodTestEquals() {
        StringList otherStringList = new StringListImpl(3);
        otherStringList.add(ITEM_1);
        otherStringList.add(ITEM_2);
        otherStringList.add(ITEM_3);

        out.clear();
        out.add(ITEM_1);
        out.add(ITEM_2);
        boolean actual = out.equals(otherStringList);
        assertFalse(actual);

        out.add(ITEM_1);
        actual = out.equals(otherStringList);
        assertFalse(actual);
    }

    @Test
    void shouldThrowItemValidateExceptionInMethodTestEquals() {
        StringList otherStringList = null;
        out.add(ITEM_1);
        assertThrows(ItemValidateException.class, () -> out.equals(otherStringList));
    }

    @Test
    void shouldReturn3InMethodSize() {
        out.add(ITEM_1);
        out.add(ITEM_2);
        out.add(ITEM_3);
        assertEquals(3, out.size());
    }

    @Test
    void shouldReturnFalseInMethodIsEmpty() {
        out.add(ITEM_1);
        assertFalse(out.isEmpty());
    }

    @Test
    void shouldReturnTrueInMethodIsEmpty() {
        assertTrue(out.isEmpty());
    }

    @Test
    void clear() {
        assertEquals(0, out.size());
    }

    @Test
    void shouldReturnStringArrayInMethodToArray() {
        StringList otherStringList = new StringListImpl(3);
        otherStringList.add(ITEM_1);
        otherStringList.add(ITEM_2);
        otherStringList.add(ITEM_3);

        out.add(ITEM_1);
        out.add(ITEM_2);
        out.add(ITEM_3);
        String[] actual = out.toArray();

        assertIterableEquals(Arrays.asList(otherStringList.toArray()), Arrays.asList(Arrays.stream(actual).toArray()));
    }

    @Test
    void shouldThrowItemNotFoundExceptionInMethodToArray() {
        assertThrows(ItemNotFoundException.class, out::toArray);
    }
}