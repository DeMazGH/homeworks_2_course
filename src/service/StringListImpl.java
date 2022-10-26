package service;

import exeption.IndexValidateException;
import exeption.ItemNotFoundExeption;
import exeption.ItemValidateException;

public class StringListImpl implements StringList {

    private String[] storage;
    private int size;

    public StringListImpl() {
        storage = new String[10];
    }

    public StringListImpl(int arrayLength) {
        storage = new String[arrayLength];
    }

    @Override
    public String add(String item) {
        validateItem(item);
        if (validateSize()) {
            expandArray();
        }

        int counter = 0;
        while (counter < storage.length) {
            if (storage[counter] == null) {
                storage[counter] = item;
                size++;
                counter++;
                break;
            }
            counter++;
        }
        return storage[counter];
    }

    @Override
    public String add(int index, String item) {
        validateItem(item);
        validateIndex(index);
        if (validateSize()) {
            expandArray();
        }

        if (storage[index] == null) {
            add(item);
            return storage[size - 1];
        } else {
            String previousCell = storage[index];
            String currentCell;
            for (int i = index + 1; i < storage.length; i++) {
                currentCell = storage[i];
                storage[i] = previousCell;
                previousCell = currentCell;
            }

            storage[index] = item;
            size++;
            return storage[index];
        }
    }

    @Override
    public String set(int index, String item) {
        validateItem(item);
        validateIndex(index);

        storage[index] = item;
        return storage[index];
    }

    @Override
    public String remove(String item) {
        validateItem(item);

        for (int i = 0; i < size - 1; i++) {
            if (storage[i].equals(item)) {
                return removeElementWithListOffset(i);
            }
        }
        throw new ItemNotFoundExeption("Элемент отсутствует в списке");
    }

    @Override
    public String remove(int index) {
        if (index > size - 1) {
            throw new ItemNotFoundExeption("Элемент отсутствует в списке");
        }
        return removeElementWithListOffset(index);
    }

    private String removeElementWithListOffset(int index) {
        String desired = storage[index];
        String currentCell;
        for (int j = index + 1; j < size - 1; j++) {
            currentCell = storage[j];
            storage[j - 1] = currentCell;
        }
        storage[size - 1] = null;
        size--;
        return desired;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }

    private void validateItem(String item) {
        if (item == null) {
            throw new ItemValidateException("Значение не может быть null");
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index > storage.length - 1) {
            throw new IndexValidateException("Значение индекса выходит за пределы массива");
        }
    }

    private boolean validateSize() {
        return size == storage.length;
    }

    private void expandArray() {
        if (storage.length == 0) {
            storage = new String[1];
        } else {
            String[] newStringArray = new String[storage.length * 2 - storage.length / 2];
            System.arraycopy(storage, 0, newStringArray, 0, storage.length);
            storage = newStringArray;
        }
    }
}
