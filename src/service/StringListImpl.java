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
        if (index < 0 || index > size - 1) {
            throw new ItemNotFoundExeption("Элемент отсутствует в списке");
        }
        return removeElementWithListOffset(index);
    }

    private String removeElementWithListOffset(int index) {
        validateIndex(index);

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
        validateItem(item);

        for (int i = 0; i < size; i++) {
            if (storage[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        validateItem(item);

        for (int i = 0; i < size - 1; i++) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        validateItem(item);

        for (int i = size - 1; i >= 0; i--) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index > size - 1) {
            throw new ItemNotFoundExeption("Элемент отсутствует в списке");
        }
        return storage[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (otherList == null) {
            throw new ItemValidateException("Элемент не может быть null");
        }

        if (size != otherList.size()) {
            return false;
        } else {
            for (int i = 0; i < size - 1; i++) {
                if (!storage[i].equals(otherList.get(i))) {
                    return false;
                }
            }
        }

        return true;
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
        for (int i = 0; i < size - 1; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    @Override
    public String[] toArray() {
        if (size == 0) {
            throw new ItemNotFoundExeption("Список пуст");
        }
        String[] newArray = new String[size];
        System.arraycopy(storage, 0, newArray, 0, size - 1);
        return newArray;
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
