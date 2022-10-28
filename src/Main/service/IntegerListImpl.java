package Main.service;

import Main.exeption.IndexValidateException;
import Main.exeption.ItemNotFoundException;
import Main.exeption.ItemValidateException;

import java.util.Arrays;

public class IntegerListImpl implements IntegerList {

    private Integer[] storage;
    private int size;

    public IntegerListImpl() {
        storage = new Integer[10];
    }

    public IntegerListImpl(int arrayLength) {
        storage = new Integer[arrayLength];
    }

    @Override
    public Integer add(Integer item) {
        validateItem(item);
        if (validateSize()) {
            expandArray();
        }
        storage[size++] = item;
        return storage[size - 1];
    }

    @Override
    public Integer add(int index, Integer item) {
        validateItem(item);
        validateIndex(index);
        if (validateSize()) {
            expandArray();
        }

        if (storage[index] == null) {
            storage[index] = item;
        } else {
            System.arraycopy(storage, index, storage, index + 1, size - index);
            storage[index] = item;
            size++;
        }
        return storage[index];
    }

    @Override
    public Integer set(int index, Integer item) {
        validateItem(item);
        validateIndex(index);
        storage[index] = item;
        return storage[index];
    }

    @Override
    public Integer remove(Integer item) {
        validateItem(item);

        for (int i = 0; i < size; i++) {
            if (storage[i].equals(item)) {
                return removeElementWithListOffset(i);
            }
        }
        throw new ItemNotFoundException("Элемент отсутствует в списке");
    }

    @Override
    public Integer remove(int index) {
        return removeElementWithListOffset(index);
    }

    private Integer removeElementWithListOffset(int index) {
        validateIndex(index);

        Integer desired = storage[index];
        Integer currentCell;
        for (int j = index + 1; j < size; j++) {
            currentCell = storage[j];
            storage[j - 1] = currentCell;
        }
        storage[size - 1] = null;
        size--;
        return desired;
    }

    @Override
    public boolean contains(Integer item) {
        return indexOf(item) != -1;
    }

    private boolean containsBinary(Integer item) {
        sort();

        int min = 0;
        int max = size - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (item.equals(storage[mid])) {
                return true;
            }

            if (item < storage[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

    public boolean containsBinaryTest(Integer item) {
        return containsBinary(item);
    }

    @Override
    public int indexOf(Integer item) {
        validateItem(item);

        for (int i = 0; i < size; i++) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer item) {
        validateItem(item);

        for (int i = size - 1; i >= 0; i--) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Integer get(int index) {
        validateIndex(index);
        return storage[index];
    }

    @Override
    public boolean equals(IntegerList otherList) {
        if (otherList == null) {
            throw new ItemValidateException("Элемент не может быть null");
        }

        if (size != otherList.size()) {
            return false;
        }
        return Arrays.equals(Arrays.stream(storage).toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        storage = new Integer[size];
        size = 0;
    }

    @Override
    public Integer[] toArray() {
        if (size == 0) {
            throw new ItemNotFoundException("Список пуст");
        }
        return Arrays.copyOf(storage, size);
    }

    private void sort() {
        for (int i = 1; i < size; i++) {
            int temp = storage[i];
            int j = i;
            while (j > 0 && storage[j - 1] >= temp) {
                storage[j] = storage[j - 1];
                j--;
            }
            storage[j] = temp;
        }
    }

    private void validateItem(Integer item) {
        if (item == null) {
            throw new ItemValidateException("Значение не может быть null");
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexValidateException("Значение индекса выходит за пределы коллекции");
        }
    }

    private boolean validateSize() {
        return size == storage.length;
    }

    private void expandArray() {
        if (storage.length == 0) {
            storage = new Integer[1];
        } else {
            Integer[] newIntegerArray = new Integer[storage.length * 2 - storage.length / 2];
            System.arraycopy(storage, 0, newIntegerArray, 0, storage.length);
            storage = newIntegerArray;
        }
    }
}
